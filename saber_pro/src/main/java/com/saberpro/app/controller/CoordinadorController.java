package com.saberpro.app.controller;

import com.saberpro.app.model.ResultadoSaberPro;
import com.saberpro.app.service.ResultadoSaberProService;
import com.saberpro.app.service.EstudianteService;
import com.saberpro.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/coordinador")
public class CoordinadorController {

    @Autowired
    private ResultadoSaberProService resultadoService;

    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/dashboard")
    public String dashboard(Model model, Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        
        Long totalEstudiantes = (long) estudianteService.obtenerTodos().size();
        Long totalResultados = (long) resultadoService.obtenerTodos().size();
        Long sobresalientes = resultadoService.contarSobresalientes();
        Double promedio = resultadoService.calcularPromedioGeneral();

        model.addAttribute("totalEstudiantes", totalEstudiantes);
        model.addAttribute("totalResultados", totalResultados);
        model.addAttribute("sobresalientes", sobresalientes);
        model.addAttribute("promedioGeneral", promedio != null ? String.format("%.2f", promedio) : "N/A");

        return "coordinador/dashboard";
    }

    // CRUD Alumnos - Informe de Alumnos
    @GetMapping("/alumnos")
    public String informeAlumnos(Model model) {
        model.addAttribute("resultados", resultadoService.obtenerInformeAlumnos());
        return "coordinador/informe-alumnos";
    }

    // Informe Detallado
    @GetMapping("/informe-detallado")
    public String informeDetallado(Model model) {
        List<ResultadoSaberPro> resultados = resultadoService.obtenerInformeDetallado();
        model.addAttribute("resultados", resultados);
        
        // Calcular estadísticas
        Double promedio = resultadoService.calcularPromedioGeneral();
        Long total = (long) resultados.size();
        Long sobresalientes = resultadoService.contarSobresalientes();
        
        model.addAttribute("promedioGeneral", promedio != null ? String.format("%.2f", promedio) : "N/A");
        model.addAttribute("totalEstudiantes", total);
        model.addAttribute("totalSobresalientes", sobresalientes);

        return "coordinador/informe-detallado";
    }

    // Informe de Beneficios
    @GetMapping("/informe-beneficios")
    public String informeBeneficios(Model model) {
        // Filtrar por rangos de beneficios
        List<ResultadoSaberPro> rango180_210 = resultadoService.obtenerPorRangoPuntaje(180, 210);
        List<ResultadoSaberPro> rango211_240 = resultadoService.obtenerPorRangoPuntaje(211, 240);
        List<ResultadoSaberPro> rango241_mas = resultadoService.obtenerPorRangoPuntaje(241, 300);
        
        model.addAttribute("todosResultados", resultadoService.obtenerTodos());
        model.addAttribute("rango180_210", rango180_210);
        model.addAttribute("rango211_240", rango211_240);
        model.addAttribute("rango241_mas", rango241_mas);
        
        model.addAttribute("count180_210", rango180_210.size());
        model.addAttribute("count211_240", rango211_240.size());
        model.addAttribute("count241_mas", rango241_mas.size());

        return "coordinador/informe-beneficios";
    }

    @GetMapping("/cambiar-contrasena")
    public String cambiarContrasenaForm() {
        return "coordinador/cambiar-contrasena";
    }

    @PostMapping("/cambiar-contrasena")
    public String cambiarContrasena(@RequestParam String nuevaContrasena,
                                    @RequestParam String confirmarContrasena,
                                    Authentication authentication,
                                    Model model) {
        if (!nuevaContrasena.equals(confirmarContrasena)) {
            model.addAttribute("error", "Las contraseñas no coinciden");
            return "coordinador/cambiar-contrasena";
        }

        try {
            usuarioService.cambiarContrasena(authentication.getName(), nuevaContrasena);
            model.addAttribute("success", "Contraseña cambiada exitosamente");
        } catch (Exception e) {
            model.addAttribute("error", "Error al cambiar contraseña: " + e.getMessage());
        }
        return "coordinador/cambiar-contrasena";
    }
}
