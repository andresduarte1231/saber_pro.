package com.saberpro.app.controller;

import com.saberpro.app.model.Usuario;
import com.saberpro.app.model.Estudiante;
import com.saberpro.app.model.Role;
import com.saberpro.app.service.UsuarioService;
import com.saberpro.app.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/dashboard")
    public String dashboard(Model model, Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("usuarios", usuarioService.obtenerTodos());
        model.addAttribute("totalUsuarios", usuarioService.obtenerTodos().size());
        model.addAttribute("totalEstudiantes", usuarioService.obtenerPorRol(Role.ESTUDIANTE).size());
        model.addAttribute("totalCoordinadores", usuarioService.obtenerPorRol(Role.COORDINADOR).size());
        return "admin/dashboard";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.obtenerTodos());
        return "admin/usuarios";
    }

    @GetMapping("/usuarios/nuevo")
    public String nuevoUsuarioForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("roles", Role.values());
        return "admin/usuario-form";
    }

    @PostMapping("/usuarios/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario, 
                                @RequestParam(required = false) String identificacion,
                                RedirectAttributes redirectAttributes) {
        try {
            if (usuario.getId() == null && usuarioService.existeUsername(usuario.getUsername())) {
                redirectAttributes.addFlashAttribute("error", "El nombre de usuario ya existe");
                return "redirect:/admin/usuarios/nuevo";
            }

            Usuario usuarioGuardado = usuarioService.guardar(usuario);

            // Si es estudiante, crear también el registro de estudiante
            if (usuario.getRole() == Role.ESTUDIANTE && identificacion != null && !identificacion.isEmpty()) {
                if (!estudianteService.existeIdentificacion(identificacion)) {
                    Estudiante estudiante = new Estudiante();
                    estudiante.setIdentificacion(identificacion);
                    estudiante.setNombreCompleto(usuario.getNombreCompleto());
                    estudiante.setUsuario(usuarioGuardado);
                    estudianteService.guardar(estudiante);
                }
            }

            redirectAttributes.addFlashAttribute("success", "Usuario guardado exitosamente");
            return "redirect:/admin/usuarios";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al guardar usuario: " + e.getMessage());
            return "redirect:/admin/usuarios/nuevo";
        }
    }

    @GetMapping("/usuarios/editar/{id}")
    public String editarUsuarioForm(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Usuario usuario = usuarioService.obtenerPorId(id)
                .orElse(null);
        if (usuario == null) {
            redirectAttributes.addFlashAttribute("error", "Usuario no encontrado");
            return "redirect:/admin/usuarios";
        }
        model.addAttribute("usuario", usuario);
        model.addAttribute("roles", Role.values());
        return "admin/usuario-form";
    }

    @GetMapping("/usuarios/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            usuarioService.eliminar(id);
            redirectAttributes.addFlashAttribute("success", "Usuario eliminado exitosamente");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al eliminar usuario: " + e.getMessage());
        }
        return "redirect:/admin/usuarios";
    }

    @GetMapping("/usuarios/desactivar/{id}")
    public String desactivarUsuario(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            usuarioService.desactivar(id);
            redirectAttributes.addFlashAttribute("success", "Usuario desactivado exitosamente");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al desactivar usuario: " + e.getMessage());
        }
        return "redirect:/admin/usuarios";
    }

    @GetMapping("/usuarios/activar/{id}")
    public String activarUsuario(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            usuarioService.activar(id);
            redirectAttributes.addFlashAttribute("success", "Usuario activado exitosamente");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al activar usuario: " + e.getMessage());
        }
        return "redirect:/admin/usuarios";
    }

    @GetMapping("/cambiar-contrasena")
    public String cambiarContrasenaForm() {
        return "admin/cambiar-contrasena";
    }

    @PostMapping("/cambiar-contrasena")
    public String cambiarContrasena(@RequestParam String nuevaContrasena,
                                    @RequestParam String confirmarContrasena,
                                    Authentication authentication,
                                    RedirectAttributes redirectAttributes) {
        if (!nuevaContrasena.equals(confirmarContrasena)) {
            redirectAttributes.addFlashAttribute("error", "Las contraseñas no coinciden");
            return "redirect:/admin/cambiar-contrasena";
        }

        try {
            usuarioService.cambiarContrasena(authentication.getName(), nuevaContrasena);
            redirectAttributes.addFlashAttribute("success", "Contraseña cambiada exitosamente");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al cambiar contraseña: " + e.getMessage());
        }
        return "redirect:/admin/dashboard";
    }
}
