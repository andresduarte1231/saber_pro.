package com.saberpro.app.config;

import com.saberpro.app.model.Role;
import com.saberpro.app.model.Usuario;
import com.saberpro.app.service.BeneficioService;
import com.saberpro.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private BeneficioService beneficioService;

    @Override
    public void run(String... args) throws Exception {
        // Inicializar beneficios según el Acuerdo UTS
        beneficioService.inicializarBeneficios();

        // Crear usuario administrador por defecto si no existe
        if (!usuarioService.existeUsername("admin")) {
            Usuario admin = new Usuario();
            admin.setUsername("admin");
            admin.setPassword("admin123");
            admin.setRole(Role.ADMIN);
            admin.setNombreCompleto("Administrador del Sistema");
            admin.setActivo(true);
            usuarioService.guardar(admin);
            System.out.println("Usuario administrador creado: admin / admin123");
        }

        // Crear usuario coordinador por defecto si no existe
        if (!usuarioService.existeUsername("coordinador")) {
            Usuario coordinador = new Usuario();
            coordinador.setUsername("coordinador");
            coordinador.setPassword("coord123");
            coordinador.setRole(Role.COORDINADOR);
            coordinador.setNombreCompleto("Coordinador Académico");
            coordinador.setActivo(true);
            usuarioService.guardar(coordinador);
            System.out.println("Usuario coordinador creado: coordinador / coord123");
        }
    }
}
