package com.saberpro.app.controller;

import com.saberpro.app.model.Estudiante;
import com.saberpro.app.model.ResultadoSaberPro;
import com.saberpro.app.model.Usuario;
import com.saberpro.app.service.ResultadoSaberProService;
import com.saberpro.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private ResultadoSaberProService resultadoService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/dashboard")
    public String dashboard(Model model, Authentication authentication) {
        Usuario usuario = usuarioService.obtenerPorUsername(authentication.getName()).orElse(null);
        
        if (usuario != null && usuario.getEstudiante() != null) {
            Estudiante estudiante = usuario.getEstudiante();
            model.addAttribute("estudiante", estudiante);
            model.addAttribute("username", authentication.getName());
            
            // Obtener resultado del estudiante
            Optional<ResultadoSaberPro> resultado = resultadoService.obtenerPorEstudianteId(estudiante.getId());
            if (resultado.isPresent()) {
                model.addAttribute("resultado", resultado.get());
                model.addAttribute("beneficio", resultado.get().getBeneficio());
            } else {
                model.addAttribute("mensaje", "Aún no tienes resultados registrados");
            }
        }

        return "estudiante/dashboard";
    }

    @GetMapping("/resultado")
    public String verResultado(Model model, Authentication authentication) {
        Usuario usuario = usuarioService.obtenerPorUsername(authentication.getName()).orElse(null);
        
        if (usuario != null && usuario.getEstudiante() != null) {
            Estudiante estudiante = usuario.getEstudiante();
            Optional<ResultadoSaberPro> resultado = resultadoService.obtenerPorEstudianteId(estudiante.getId());
            
            if (resultado.isPresent()) {
                model.addAttribute("resultado", resultado.get());
                model.addAttribute("estudiante", estudiante);
                model.addAttribute("beneficio", resultado.get().getBeneficio());
            } else {
                model.addAttribute("mensaje", "No se encontraron resultados");
            }
        }

        return "estudiante/resultado";
    }

    @GetMapping("/beneficios")
    public String verBeneficios(Model model, Authentication authentication) {
        Usuario usuario = usuarioService.obtenerPorUsername(authentication.getName()).orElse(null);
        
        if (usuario != null && usuario.getEstudiante() != null) {
            Estudiante estudiante = usuario.getEstudiante();
            Optional<ResultadoSaberPro> resultado = resultadoService.obtenerPorEstudianteId(estudiante.getId());
            
            if (resultado.isPresent() && resultado.get().getBeneficio() != null) {
                model.addAttribute("resultado", resultado.get());
                model.addAttribute("beneficio", resultado.get().getBeneficio());
                model.addAttribute("estudiante", estudiante);
            } else {
                model.addAttribute("mensaje", "No tienes beneficios asignados aún");
            }
        }

        return "estudiante/beneficios";
    }

    @GetMapping("/cambiar-contrasena")
    public String cambiarContrasenaForm() {
        return "estudiante/cambiar-contrasena";
    }

    @PostMapping("/cambiar-contrasena")
    public String cambiarContrasena(@RequestParam String nuevaContrasena,
                                    @RequestParam String confirmarContrasena,
                                    Authentication authentication,
                                    Model model) {
        if (!nuevaContrasena.equals(confirmarContrasena)) {
            model.addAttribute("error", "Las contraseñas no coinciden");
            return "estudiante/cambiar-contrasena";
        }

        try {
            usuarioService.cambiarContrasena(authentication.getName(), nuevaContrasena);
            model.addAttribute("success", "Contraseña cambiada exitosamente");
        } catch (Exception e) {
            model.addAttribute("error", "Error al cambiar contraseña: " + e.getMessage());
        }
        return "estudiante/cambiar-contrasena";
    }
}
