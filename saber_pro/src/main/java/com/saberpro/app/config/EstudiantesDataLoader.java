package com.saberpro.app.config;

import com.saberpro.app.model.*;
import com.saberpro.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@Configuration
public class EstudiantesDataLoader {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private ResultadoSaberProRepository resultadoRepository;

    @Autowired
    private BeneficioRepository beneficioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public CommandLineRunner cargarEstudiantes() {
        return args -> {
            // Solo cargar si no existen estudiantes
            if (estudianteRepository.count() > 0) {
                System.out.println("Los estudiantes ya están cargados en la base de datos");
                return;
            }

            System.out.println("Cargando estudiantes del informe SABER PRO 2025...");

            Beneficio beneficio1 = beneficioRepository.findById(1L).orElse(null);
            LocalDate fechaPrueba = LocalDate.of(2024, 11, 15);
            String periodo = "2024-2";

            // 1. Miguel Iván Barbosa Ramírez - Puntaje: 200 (Beneficio 1)
            crearEstudianteCompleto("mbarbosa", "31453462", "Miguel Iván Barbosa Ramírez", 
                "miguel.barbosa31@correo.com", "3710944263", 200, 128, 182, 202, 206, 183, 
                beneficio1, fechaPrueba, periodo);

            // 2. Felipe Adrián Quintero Gómez - Puntaje: 165 (Sin beneficio)
            crearEstudianteCompleto("fquintero", "75550526", "Felipe Adrián Quintero Gómez", 
                "felipe.quintero73@correo.com", "3603028012", 165, 125, 151, 179, 163, 205, 
                null, fechaPrueba, periodo);

            // 3. Andrés Alejandro Parra Mejía - Puntaje: 164 (Sin beneficio)
            crearEstudianteCompleto("aparra", "46698108", "Andrés Alejandro Parra Mejía", 
                "andrés.parra40@correo.com", "3243114972", 164, 159, 172, 182, 142, 165, 
                null, fechaPrueba, periodo);

            // 4. Juan David Anaya Gómez - Puntaje: 160 (Sin beneficio)
            crearEstudianteCompleto("janaya", "45231533", "Juan David Anaya Gómez", 
                "juan.anaya31@correo.com", "3763991091", 160, 146, 199, 157, 149, 147, 
                null, fechaPrueba, periodo);

            // 5. Miguel Felipe Flor Martínez - Puntaje: 160 (Sin beneficio)
            crearEstudianteCompleto("mflor", "53316653", "Miguel Felipe Flor Martínez", 
                "miguel.flor72@correo.com", "3774675916", 160, 198, 153, 147, 157, 146, 
                null, fechaPrueba, periodo);

            // 6. Mateo Felipe Garcia Ramírez - Puntaje: 157 (Sin beneficio)
            crearEstudianteCompleto("mgarcia", "91135112", "Mateo Felipe Garcia Ramírez", 
                "mateo.garcia84@correo.com", "3529154404", 157, 179, 172, 158, 140, 136, 
                null, fechaPrueba, periodo);

            // 7. Juan Santiago Manosalva Torres - Puntaje: 153 (Sin beneficio)
            crearEstudianteCompleto("jmanosalva", "26677860", "Juan Santiago Manosalva Torres", 
                "juan.manosalva39@correo.com", "3223607625", 153, 115, 152, 159, 172, 165, 
                null, fechaPrueba, periodo);

            // 8. Mateo Andrés Mendoza García - Puntaje: 151 (Sin beneficio)
            crearEstudianteCompleto("mmendoza", "73009480", "Mateo Andrés Mendoza García", 
                "mateo.mendoza76@correo.com", "3845645427", 151, 132, 123, 125, 169, 204, 
                null, fechaPrueba, periodo);

            // 9. Juan David Beltran Duarte - Puntaje: 150 (Sin beneficio)
            crearEstudianteCompleto("jbeltran", "50943227", "Juan David Beltran Duarte", 
                "juan.beltran62@correo.com", "3159463850", 150, 86, 187, 160, 171, 148, 
                null, fechaPrueba, periodo);

            // 10. Daniel Esteban Santamaria Duarte - Puntaje: 150 (Sin beneficio)
            crearEstudianteCompleto("dsantamaria", "70914222", "Daniel Esteban Santamaria Duarte", 
                "daniel.santamaria82@correo.com", "3291204419", 150, 175, 149, 145, 158, 125, 
                null, fechaPrueba, periodo);

            // 11. Jorge Esteban Sanchez Torres - Puntaje: 149 (Sin beneficio)
            crearEstudianteCompleto("jsanchez", "15273778", "Jorge Esteban Sanchez Torres", 
                "jorge.sanchez63@correo.com", "3562294354", 149, 209, 143, 117, 129, 147, 
                null, fechaPrueba, periodo);

            // 12. Mateo Andrés Romero Martínez - Puntaje: 146 (Sin beneficio)
            crearEstudianteCompleto("mromero", "17779199", "Mateo Andrés Romero Martínez", 
                "mateo.romero78@correo.com", "3747503106", 146, 93, 183, 155, 164, 133, 
                null, fechaPrueba, periodo);

            // 13. Miguel Santiago Luna Gómez - Puntaje: 141 (Sin beneficio)
            crearEstudianteCompleto("mluna", "39720157", "Miguel Santiago Luna Gómez", 
                "miguel.luna59@correo.com", "3308464983", 141, 125, 157, 138, 135, 152, 
                null, fechaPrueba, periodo);

            // 14. Daniel Adrián Triana Ramírez - Puntaje: 141 (Sin beneficio)
            crearEstudianteCompleto("dtriana", "67517549", "Daniel Adrián Triana Ramírez", 
                "daniel.triana80@correo.com", "3238377032", 141, 150, 136, 145, 150, 126, 
                null, fechaPrueba, periodo);

            // 15. Andrés Ricardo Suarez Torres - Puntaje: 140 (Sin beneficio)
            crearEstudianteCompleto("asuarez", "44147736", "Andrés Ricardo Suarez Torres", 
                "andrés.suarez25@correo.com", "3432731552", 140, 128, 146, 146, 132, 147, 
                null, fechaPrueba, periodo);

            // 16. Sebastián Santiago Garcia Rojas - Puntaje: 139 (Sin beneficio)
            crearEstudianteCompleto("sgarcia", "79605902", "Sebastián Santiago Garcia Rojas", 
                "sebastián.garcia40@correo.com", "3749171033", 139, 129, 138, 148, 146, 135, 
                null, fechaPrueba, periodo);

            // 17. Felipe Santiago Pinzon Castro - Puntaje: 138 (Sin beneficio)
            crearEstudianteCompleto("fpinzon", "13884706", "Felipe Santiago Pinzon Castro", 
                "felipe.pinzon51@correo.com", "3742037749", 138, 153, 123, 127, 147, 140, 
                null, fechaPrueba, periodo);

            // 18. Sebastián Andrés Jaimes Duarte - Puntaje: 137 (Sin beneficio)
            crearEstudianteCompleto("sjaimes", "79915130", "Sebastián Andrés Jaimes Duarte", 
                "sebastián.jaimes17@correo.com", "3810342188", 137, 166, 157, 124, 100, 140, 
                null, fechaPrueba, periodo);

            // 19. Sebastián Alejandro Niño Martínez - Puntaje: 134 (Sin beneficio)
            crearEstudianteCompleto("snino", "49993219", "Sebastián Alejandro Niño Martínez", 
                "sebastián.niño44@correo.com", "3367671293", 134, 165, 137, 136, 118, 116, 
                null, fechaPrueba, periodo);

            // 20. Sebastián Alejandro Fabian Pérez - Puntaje: 133 (Sin beneficio)
            crearEstudianteCompleto("sfabian", "30151092", "Sebastián Alejandro Fabian Pérez", 
                "sebastián.fabian25@correo.com", "3633016209", 133, 139, 93, 168, 150, 114, 
                null, fechaPrueba, periodo);

            // 21. Felipe Santiago Hernandez Rojas - Puntaje: 132 (Sin beneficio)
            crearEstudianteCompleto("fhernandez", "58256132", "Felipe Santiago Hernandez Rojas", 
                "felipe.hernandez88@correo.com", "3564821441", 132, 116, 166, 136, 104, 140, 
                null, fechaPrueba, periodo);

            // 22. Mateo Santiago Larios Mejía - Puntaje: 131 (Sin beneficio)
            crearEstudianteCompleto("mlarios", "97771805", "Mateo Santiago Larios Mejía", 
                "mateo.larios52@correo.com", "3181633614", 131, 149, 123, 129, 121, 131, 
                null, fechaPrueba, periodo);

            // 23. Daniel Alejandro Calderon Ramírez - Puntaje: 130 (Sin beneficio)
            crearEstudianteCompleto("dcalderon", "54829852", "Daniel Alejandro Calderon Ramírez", 
                "daniel.calderon52@correo.com", "3797331065", 130, 127, 147, 134, 111, 131, 
                null, fechaPrueba, periodo);

            // 24. Luis Camilo Villarreal Gómez - Puntaje: 129 (Sin beneficio)
            crearEstudianteCompleto("lvillarreal", "47611764", "Luis Camilo Villarreal Gómez", 
                "luis.villarreal32@correo.com", "3299049309", 129, 96, 162, 114, 131, 144, 
                null, fechaPrueba, periodo);

            // 25. Jorge Ricardo Restrepo Duarte - Puntaje: 126 (Sin beneficio)
            crearEstudianteCompleto("jrestrepo", "30485073", "Jorge Ricardo Restrepo Duarte", 
                "jorge.restrepo39@correo.com", "3208512589", 126, 81, 134, 126, 149, 139, 
                null, fechaPrueba, periodo);

            // 26. Andrés Adrián Caceres Pérez - Puntaje: 125 (Sin beneficio)
            crearEstudianteCompleto("acaceres", "64940712", "Andrés Adrián Caceres Pérez", 
                "andrés.caceres51@correo.com", "3645966426", 125, 124, 135, 108, 92, 165, 
                null, fechaPrueba, periodo);

            // 27. Mateo Iván Tabares Gómez - Puntaje: 124 (Sin beneficio)
            crearEstudianteCompleto("mtabares", "29920061", "Mateo Iván Tabares Gómez", 
                "mateo.tabares93@correo.com", "3514450073", 124, 131, 131, 107, 88, 162, 
                null, fechaPrueba, periodo);

            // 28. Miguel Ricardo Naranjo Ramírez - Puntaje: 122 (Sin beneficio)
            crearEstudianteCompleto("mnaranjo", "33078361", "Miguel Ricardo Naranjo Ramírez", 
                "miguel.naranjo60@correo.com", "3125006978", 122, 166, 113, 113, 112, 106, 
                null, fechaPrueba, periodo);

            // 29. Miguel Esteban Prada García - Puntaje: 122 (Sin beneficio)
            crearEstudianteCompleto("mprada", "35850972", "Miguel Esteban Prada García", 
                "miguel.prada74@correo.com", "3533311919", 122, 119, 125, 137, 107, 123, 
                null, fechaPrueba, periodo);

            // 30. Sebastián Andrés Vargas Duarte - Puntaje: 114 (Sin beneficio)
            crearEstudianteCompleto("svargas", "89144805", "Sebastián Andrés Vargas Duarte", 
                "sebastián.vargas78@correo.com", "3254040204", 114, 95, 120, 151, 86, 119, 
                null, fechaPrueba, periodo);

            // 31. Carlos Ricardo Torres Martínez - Puntaje: 113 (Sin beneficio)
            crearEstudianteCompleto("ctorres", "83126639", "Carlos Ricardo Torres Martínez", 
                "carlos.torres41@correo.com", "3145769572", 113, 109, 105, 104, 103, 142, 
                null, fechaPrueba, periodo);

            // 32. Daniel Ricardo Ortiz Mejía - Puntaje: 107 (Sin beneficio)
            crearEstudianteCompleto("dortiz", "11937851", "Daniel Ricardo Ortiz Mejía", 
                "daniel.ortiz31@correo.com", "3593274865", 107, 128, 81, 107, 102, 119, 
                null, fechaPrueba, periodo);

            // 33. Jorge Esteban Villamizar García - Puntaje: 106 (Sin beneficio)
            crearEstudianteCompleto("jvillamizar", "99250637", "Jorge Esteban Villamizar García", 
                "jorge.villamizar93@correo.com", "3854952644", 106, 134, 96, 92, 110, 97, 
                null, fechaPrueba, periodo);

            // 34. Felipe Iván Restrepo Rojas - Puntaje: 96 (Sin beneficio)
            crearEstudianteCompleto("frestrepo", "90110748", "Felipe Iván Restrepo Rojas", 
                "felipe.restrepo21@correo.com", "3180296033", 96, 0, 117, 122, 105, 137, 
                null, fechaPrueba, periodo);

            System.out.println("✓ Cargados 34 estudiantes del informe SABER PRO 2025");
            System.out.println("✓ Usuario: primera letra del nombre + primer apellido");
            System.out.println("✓ Contraseña: número de documento");
            System.out.println("✓ Beneficios asignados automáticamente según puntaje");
        };
    }

    private void crearEstudianteCompleto(String username, String identificacion, String nombreCompleto,
                                         String correo, String telefono, int puntajeGlobal, 
                                         int comunicacionEscrita, int razonamientoCuantitativo,
                                         int lecturaCritica, int competenciasCiudadanas, int ingles,
                                         Beneficio beneficio, LocalDate fechaPrueba, String periodo) {
        
        // Crear usuario con contraseña = número de documento
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(passwordEncoder.encode(identificacion)); // Contraseña es el número de documento
        usuario.setRole(Role.ESTUDIANTE);
        usuario.setActivo(true);
        usuario.setNombreCompleto(nombreCompleto);
        usuario = usuarioRepository.save(usuario);

        // Crear estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setIdentificacion(identificacion);
        estudiante.setNombreCompleto(nombreCompleto);
        estudiante.setPrograma("Ingeniería de Sistemas");
        estudiante.setCorreo(correo);
        estudiante.setTelefono(telefono);
        estudiante.setUsuario(usuario);
        estudiante = estudianteRepository.save(estudiante);

        // Crear resultado Saber Pro
        ResultadoSaberPro resultado = new ResultadoSaberPro();
        resultado.setEstudiante(estudiante);
        resultado.setPuntajeGlobal(puntajeGlobal);
        resultado.setComunicacionEscrita(comunicacionEscrita);
        resultado.setRazonamientoCuantitativo(razonamientoCuantitativo);
        resultado.setLecturaCritica(lecturaCritica);
        resultado.setCompetenciasCiudadanas(competenciasCiudadanas);
        resultado.setIngles(ingles);
        resultado.setFechaPrueba(fechaPrueba);
        resultado.setPeriodo(periodo);
        resultado.setBeneficio(beneficio);
        resultadoRepository.save(resultado);

        System.out.println("✓ Cargado: " + nombreCompleto + " (Usuario: " + username + ", Puntaje: " + puntajeGlobal + ")");
    }
}
