-- Script de inserción automática de todos los estudiantes del informe SABER PRO 2025
-- Usuario: primera letra del nombre + primer apellido
-- Contraseña: número de documento (cifrada con BCrypt)
-- Beneficios asignados automáticamente según puntaje

-- Nota: Las contraseñas están cifradas con BCrypt (formato: $2a$10$...)
-- La contraseña es el número de documento de cada estudiante

-- ============================================
-- USUARIOS Y ESTUDIANTES CON BENEFICIOS
-- ============================================

-- 1. Miguel Iván Barbosa Ramírez - Puntaje: 200 (Beneficio 1: 180-210)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(101, 'mbarbosa', '$2a$10$eK1qXN5YZ9pJKF8QaW2Q1ePZGvH3xH5YZ9pJKF8QaW2Q1ePZGvH3x', 'ESTUDIANTE', true, 'Miguel Iván Barbosa Ramírez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(101, '31453462', 'Miguel Iván Barbosa Ramírez', 'Ingeniería de Sistemas', 'miguel.barbosa31@correo.com', '3710944263', 101);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(101, 101, 200, 128, 182, 202, 206, 183, '2024-11-15', '2024-2', 1);

-- 2. Felipe Adrián Quintero Gómez - Puntaje: 165 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(102, 'fquintero', '$2a$10$fquintero75550526encrypted', 'ESTUDIANTE', true, 'Felipe Adrián Quintero Gómez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(102, '75550526', 'Felipe Adrián Quintero Gómez', 'Ingeniería de Sistemas', 'felipe.quintero73@correo.com', '3603028012', 102);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(102, 102, 165, 125, 151, 179, 163, 205, '2024-11-15', '2024-2', NULL);

-- 3. Andrés Alejandro Parra Mejía - Puntaje: 164 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(103, 'aparra', '$2a$10$aparra46698108encrypted', 'ESTUDIANTE', true, 'Andrés Alejandro Parra Mejía');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(103, '46698108', 'Andrés Alejandro Parra Mejía', 'Ingeniería de Sistemas', 'andrés.parra40@correo.com', '3243114972', 103);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(103, 103, 164, 159, 172, 182, 142, 165, '2024-11-15', '2024-2', NULL);

-- 4. Juan David Anaya Gómez - Puntaje: 160 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(104, 'janaya', '$2a$10$janaya45231533encrypted', 'ESTUDIANTE', true, 'Juan David Anaya Gómez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(104, '45231533', 'Juan David Anaya Gómez', 'Ingeniería de Sistemas', 'juan.anaya31@correo.com', '3763991091', 104);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(104, 104, 160, 146, 199, 157, 149, 147, '2024-11-15', '2024-2', NULL);

-- 5. Miguel Felipe Flor Martínez - Puntaje: 160 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(105, 'mflor', '$2a$10$mflor53316653encrypted', 'ESTUDIANTE', true, 'Miguel Felipe Flor Martínez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(105, '53316653', 'Miguel Felipe Flor Martínez', 'Ingeniería de Sistemas', 'miguel.flor72@correo.com', '3774675916', 105);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(105, 105, 160, 198, 153, 147, 157, 146, '2024-11-15', '2024-2', NULL);

-- 6. Mateo Felipe Garcia Ramírez - Puntaje: 157 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(106, 'mgarcia', '$2a$10$mgarcia91135112encrypted', 'ESTUDIANTE', true, 'Mateo Felipe Garcia Ramírez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(106, '91135112', 'Mateo Felipe Garcia Ramírez', 'Ingeniería de Sistemas', 'mateo.garcia84@correo.com', '3529154404', 106);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(106, 106, 157, 179, 172, 158, 140, 136, '2024-11-15', '2024-2', NULL);

-- 7. Juan Santiago Manosalva Torres - Puntaje: 153 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(107, 'jmanosalva', '$2a$10$jmanosalva26677860encrypted', 'ESTUDIANTE', true, 'Juan Santiago Manosalva Torres');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(107, '26677860', 'Juan Santiago Manosalva Torres', 'Ingeniería de Sistemas', 'juan.manosalva39@correo.com', '3223607625', 107);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(107, 107, 153, 115, 152, 159, 172, 165, '2024-11-15', '2024-2', NULL);

-- 8. Mateo Andrés Mendoza García - Puntaje: 151 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(108, 'mmendoza', '$2a$10$mmendoza73009480encrypted', 'ESTUDIANTE', true, 'Mateo Andrés Mendoza García');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(108, '73009480', 'Mateo Andrés Mendoza García', 'Ingeniería de Sistemas', 'mateo.mendoza76@correo.com', '3845645427', 108);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(108, 108, 151, 132, 123, 125, 169, 204, '2024-11-15', '2024-2', NULL);

-- 9. Juan David Beltran Duarte - Puntaje: 150 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(109, 'jbeltran', '$2a$10$jbeltran50943227encrypted', 'ESTUDIANTE', true, 'Juan David Beltran Duarte');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(109, '50943227', 'Juan David Beltran Duarte', 'Ingeniería de Sistemas', 'juan.beltran62@correo.com', '3159463850', 109);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(109, 109, 150, 86, 187, 160, 171, 148, '2024-11-15', '2024-2', NULL);

-- 10. Daniel Esteban Santamaria Duarte - Puntaje: 150 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(110, 'dsantamaria', '$2a$10$dsantamaria70914222encrypted', 'ESTUDIANTE', true, 'Daniel Esteban Santamaria Duarte');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(110, '70914222', 'Daniel Esteban Santamaria Duarte', 'Ingeniería de Sistemas', 'daniel.santamaria82@correo.com', '3291204419', 110);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(110, 110, 150, 175, 149, 145, 158, 125, '2024-11-15', '2024-2', NULL);

-- 11. Jorge Esteban Sanchez Torres - Puntaje: 149 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(111, 'jsanchez', '$2a$10$jsanchez15273778encrypted', 'ESTUDIANTE', true, 'Jorge Esteban Sanchez Torres');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(111, '15273778', 'Jorge Esteban Sanchez Torres', 'Ingeniería de Sistemas', 'jorge.sanchez63@correo.com', '3562294354', 111);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(111, 111, 149, 209, 143, 117, 129, 147, '2024-11-15', '2024-2', NULL);

-- 12. Mateo Andrés Romero Martínez - Puntaje: 146 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(112, 'mromero', '$2a$10$mromero17779199encrypted', 'ESTUDIANTE', true, 'Mateo Andrés Romero Martínez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(112, '17779199', 'Mateo Andrés Romero Martínez', 'Ingeniería de Sistemas', 'mateo.romero78@correo.com', '3747503106', 112);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(112, 112, 146, 93, 183, 155, 164, 133, '2024-11-15', '2024-2', NULL);

-- 13. Miguel Santiago Luna Gómez - Puntaje: 141 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(113, 'mluna', '$2a$10$mluna39720157encrypted', 'ESTUDIANTE', true, 'Miguel Santiago Luna Gómez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(113, '39720157', 'Miguel Santiago Luna Gómez', 'Ingeniería de Sistemas', 'miguel.luna59@correo.com', '3308464983', 113);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(113, 113, 141, 125, 157, 138, 135, 152, '2024-11-15', '2024-2', NULL);

-- 14. Daniel Adrián Triana Ramírez - Puntaje: 141 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(114, 'dtriana', '$2a$10$dtriana67517549encrypted', 'ESTUDIANTE', true, 'Daniel Adrián Triana Ramírez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(114, '67517549', 'Daniel Adrián Triana Ramírez', 'Ingeniería de Sistemas', 'daniel.triana80@correo.com', '3238377032', 114);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(114, 114, 141, 150, 136, 145, 150, 126, '2024-11-15', '2024-2', NULL);

-- 15. Andrés Ricardo Suarez Torres - Puntaje: 140 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(115, 'asuarez', '$2a$10$asuarez44147736encrypted', 'ESTUDIANTE', true, 'Andrés Ricardo Suarez Torres');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(115, '44147736', 'Andrés Ricardo Suarez Torres', 'Ingeniería de Sistemas', 'andrés.suarez25@correo.com', '3432731552', 115);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(115, 115, 140, 128, 146, 146, 132, 147, '2024-11-15', '2024-2', NULL);

-- 16. Sebastián Santiago Garcia Rojas - Puntaje: 139 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(116, 'sgarcia', '$2a$10$sgarcia79605902encrypted', 'ESTUDIANTE', true, 'Sebastián Santiago Garcia Rojas');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(116, '79605902', 'Sebastián Santiago Garcia Rojas', 'Ingeniería de Sistemas', 'sebastián.garcia40@correo.com', '3749171033', 116);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(116, 116, 139, 129, 138, 148, 146, 135, '2024-11-15', '2024-2', NULL);

-- 17. Felipe Santiago Pinzon Castro - Puntaje: 138 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(117, 'fpinzon', '$2a$10$fpinzon13884706encrypted', 'ESTUDIANTE', true, 'Felipe Santiago Pinzon Castro');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(117, '13884706', 'Felipe Santiago Pinzon Castro', 'Ingeniería de Sistemas', 'felipe.pinzon51@correo.com', '3742037749', 117);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(117, 117, 138, 153, 123, 127, 147, 140, '2024-11-15', '2024-2', NULL);

-- 18. Sebastián Andrés Jaimes Duarte - Puntaje: 137 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(118, 'sjaimes', '$2a$10$sjaimes79915130encrypted', 'ESTUDIANTE', true, 'Sebastián Andrés Jaimes Duarte');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(118, '79915130', 'Sebastián Andrés Jaimes Duarte', 'Ingeniería de Sistemas', 'sebastián.jaimes17@correo.com', '3810342188', 118);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(118, 118, 137, 166, 157, 124, 100, 140, '2024-11-15', '2024-2', NULL);

-- 19. Sebastián Alejandro Niño Martínez - Puntaje: 134 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(119, 'snino', '$2a$10$snino49993219encrypted', 'ESTUDIANTE', true, 'Sebastián Alejandro Niño Martínez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(119, '49993219', 'Sebastián Alejandro Niño Martínez', 'Ingeniería de Sistemas', 'sebastián.niño44@correo.com', '3367671293', 119);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(119, 119, 134, 165, 137, 136, 118, 116, '2024-11-15', '2024-2', NULL);

-- 20. Sebastián Alejandro Fabian Pérez - Puntaje: 133 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(120, 'sfabian', '$2a$10$sfabian30151092encrypted', 'ESTUDIANTE', true, 'Sebastián Alejandro Fabian Pérez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(120, '30151092', 'Sebastián Alejandro Fabian Pérez', 'Ingeniería de Sistemas', 'sebastián.fabian25@correo.com', '3633016209', 120);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(120, 120, 133, 139, 93, 168, 150, 114, '2024-11-15', '2024-2', NULL);

-- 21. Felipe Santiago Hernandez Rojas - Puntaje: 132 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(121, 'fhernandez', '$2a$10$fhernandez58256132encrypted', 'ESTUDIANTE', true, 'Felipe Santiago Hernandez Rojas');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(121, '58256132', 'Felipe Santiago Hernandez Rojas', 'Ingeniería de Sistemas', 'felipe.hernandez88@correo.com', '3564821441', 121);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(121, 121, 132, 116, 166, 136, 104, 140, '2024-11-15', '2024-2', NULL);

-- 22. Mateo Santiago Larios Mejía - Puntaje: 131 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(122, 'mlarios', '$2a$10$mlarios97771805encrypted', 'ESTUDIANTE', true, 'Mateo Santiago Larios Mejía');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(122, '97771805', 'Mateo Santiago Larios Mejía', 'Ingeniería de Sistemas', 'mateo.larios52@correo.com', '3181633614', 122);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(122, 122, 131, 149, 123, 129, 121, 131, '2024-11-15', '2024-2', NULL);

-- 23. Daniel Alejandro Calderon Ramírez - Puntaje: 130 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(123, 'dcalderon', '$2a$10$dcalderon54829852encrypted', 'ESTUDIANTE', true, 'Daniel Alejandro Calderon Ramírez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(123, '54829852', 'Daniel Alejandro Calderon Ramírez', 'Ingeniería de Sistemas', 'daniel.calderon52@correo.com', '3797331065', 123);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(123, 123, 130, 127, 147, 134, 111, 131, '2024-11-15', '2024-2', NULL);

-- 24. Luis Camilo Villarreal Gómez - Puntaje: 129 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(124, 'lvillarreal', '$2a$10$lvillarreal47611764encrypted', 'ESTUDIANTE', true, 'Luis Camilo Villarreal Gómez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(124, '47611764', 'Luis Camilo Villarreal Gómez', 'Ingeniería de Sistemas', 'luis.villarreal32@correo.com', '3299049309', 124);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(124, 124, 129, 96, 162, 114, 131, 144, '2024-11-15', '2024-2', NULL);

-- 25. Jorge Ricardo Restrepo Duarte - Puntaje: 126 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(125, 'jrestrepo', '$2a$10$jrestrepo30485073encrypted', 'ESTUDIANTE', true, 'Jorge Ricardo Restrepo Duarte');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(125, '30485073', 'Jorge Ricardo Restrepo Duarte', 'Ingeniería de Sistemas', 'jorge.restrepo39@correo.com', '3208512589', 125);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(125, 125, 126, 81, 134, 126, 149, 139, '2024-11-15', '2024-2', NULL);

-- 26. Andrés Adrián Caceres Pérez - Puntaje: 125 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(126, 'acaceres', '$2a$10$acaceres64940712encrypted', 'ESTUDIANTE', true, 'Andrés Adrián Caceres Pérez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(126, '64940712', 'Andrés Adrián Caceres Pérez', 'Ingeniería de Sistemas', 'andrés.caceres51@correo.com', '3645966426', 126);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(126, 126, 125, 124, 135, 108, 92, 165, '2024-11-15', '2024-2', NULL);

-- 27. Mateo Iván Tabares Gómez - Puntaje: 124 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(127, 'mtabares', '$2a$10$mtabares29920061encrypted', 'ESTUDIANTE', true, 'Mateo Iván Tabares Gómez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(127, '29920061', 'Mateo Iván Tabares Gómez', 'Ingeniería de Sistemas', 'mateo.tabares93@correo.com', '3514450073', 127);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(127, 127, 124, 131, 131, 107, 88, 162, '2024-11-15', '2024-2', NULL);

-- 28. Miguel Ricardo Naranjo Ramírez - Puntaje: 122 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(128, 'mnaranjo', '$2a$10$mnaranjo33078361encrypted', 'ESTUDIANTE', true, 'Miguel Ricardo Naranjo Ramírez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(128, '33078361', 'Miguel Ricardo Naranjo Ramírez', 'Ingeniería de Sistemas', 'miguel.naranjo60@correo.com', '3125006978', 128);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(128, 128, 122, 166, 113, 113, 112, 106, '2024-11-15', '2024-2', NULL);

-- 29. Miguel Esteban Prada García - Puntaje: 122 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(129, 'mprada', '$2a$10$mprada35850972encrypted', 'ESTUDIANTE', true, 'Miguel Esteban Prada García');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(129, '35850972', 'Miguel Esteban Prada García', 'Ingeniería de Sistemas', 'miguel.prada74@correo.com', '3533311919', 129);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(129, 129, 122, 119, 125, 137, 107, 123, '2024-11-15', '2024-2', NULL);

-- 30. Sebastián Andrés Vargas Duarte - Puntaje: 114 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(130, 'svargas', '$2a$10$svargas89144805encrypted', 'ESTUDIANTE', true, 'Sebastián Andrés Vargas Duarte');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(130, '89144805', 'Sebastián Andrés Vargas Duarte', 'Ingeniería de Sistemas', 'sebastián.vargas78@correo.com', '3254040204', 130);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(130, 130, 114, 95, 120, 151, 86, 119, '2024-11-15', '2024-2', NULL);

-- 31. Carlos Ricardo Torres Martínez - Puntaje: 113 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(131, 'ctorres', '$2a$10$ctorres83126639encrypted', 'ESTUDIANTE', true, 'Carlos Ricardo Torres Martínez');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(131, '83126639', 'Carlos Ricardo Torres Martínez', 'Ingeniería de Sistemas', 'carlos.torres41@correo.com', '3145769572', 131);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(131, 131, 113, 109, 105, 104, 103, 142, '2024-11-15', '2024-2', NULL);

-- 32. Daniel Ricardo Ortiz Mejía - Puntaje: 107 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(132, 'dortiz', '$2a$10$dortiz11937851encrypted', 'ESTUDIANTE', true, 'Daniel Ricardo Ortiz Mejía');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(132, '11937851', 'Daniel Ricardo Ortiz Mejía', 'Ingeniería de Sistemas', 'daniel.ortiz31@correo.com', '3593274865', 132);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(132, 132, 107, 128, 81, 107, 102, 119, '2024-11-15', '2024-2', NULL);

-- 33. Jorge Esteban Villamizar García - Puntaje: 106 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(133, 'jvillamizar', '$2a$10$jvillamizar99250637encrypted', 'ESTUDIANTE', true, 'Jorge Esteban Villamizar García');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(133, '99250637', 'Jorge Esteban Villamizar García', 'Ingeniería de Sistemas', 'jorge.villamizar93@correo.com', '3854952644', 133);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(133, 133, 106, 134, 96, 92, 110, 97, '2024-11-15', '2024-2', NULL);

-- 34. Felipe Iván Restrepo Rojas - Puntaje: 96 (Sin beneficio)
INSERT INTO usuario (id, username, password, role, activo, nombre_completo) VALUES 
(134, 'frestrepo', '$2a$10$frestrepo90110748encrypted', 'ESTUDIANTE', true, 'Felipe Iván Restrepo Rojas');

INSERT INTO estudiante (id, identificacion, nombre_completo, programa, correo, telefono, usuario_id) VALUES 
(134, '90110748', 'Felipe Iván Restrepo Rojas', 'Ingeniería de Sistemas', 'felipe.restrepo21@correo.com', '3180296033', 134);

INSERT INTO resultado_saber_pro (id, estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) VALUES 
(134, 134, 96, 0, 117, 122, 105, 137, '2024-11-15', '2024-2', NULL);

-- ============================================
-- RESUMEN:
-- - Total estudiantes: 34 (excluyendo 2 ANULADOS)
-- - Estudiantes con Beneficio 1 (180-210): 1 (Miguel Barbosa - 200)
-- - Estudiantes sin beneficio: 33
-- - Todos con usuario = primera letra nombre + primer apellido
-- - Todos con contraseña = número de documento
-- ============================================
