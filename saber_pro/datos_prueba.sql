-- =====================================================
-- SCRIPT DE DATOS DE PRUEBA - SISTEMA SABER PRO UTS
-- =====================================================
-- Este script inserta datos de prueba completos para el sistema
-- Incluye estudiantes con diferentes niveles de puntaje

-- IMPORTANTE: Este script asume que ya se han creado los usuarios
-- por el DataInitializer (admin y coordinador)

-- =====================================================
-- USUARIOS Y ESTUDIANTES
-- =====================================================

-- Estudiante 1: SOBRESALIENTE (Puntaje 255)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('juan.perez', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Juan Pérez García');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1098765432', 'Juan Pérez García', 'Ingeniería de Sistemas', 'juan.perez@uts.edu.co', '3101234567', 
        (SELECT id FROM usuarios WHERE username = 'juan.perez'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1098765432'), 
    255, 52, 54, 50, 48, 51, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'SOBRESALIENTE'),
    'Excelente desempeño en todas las áreas'
);

-- Estudiante 2: SOBRESALIENTE (Puntaje 245)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('ana.martinez', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Ana Martínez Silva');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1087654321', 'Ana Martínez Silva', 'Ingeniería Industrial', 'ana.martinez@uts.edu.co', '3109876543', 
        (SELECT id FROM usuarios WHERE username = 'ana.martinez'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1087654321'), 
    245, 49, 51, 48, 47, 50, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'SOBRESALIENTE'),
    'Destacado en razonamiento cuantitativo'
);

-- Estudiante 3: INTERMEDIO (Puntaje 225)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('maria.lopez', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'María López Torres');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1076543210', 'María López Torres', 'Administración de Empresas', 'maria.lopez@uts.edu.co', '3207654321', 
        (SELECT id FROM usuarios WHERE username = 'maria.lopez'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1076543210'), 
    225, 45, 47, 44, 43, 46, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'INTERMEDIO'),
    'Buen desempeño general'
);

-- Estudiante 4: INTERMEDIO (Puntaje 215)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('pedro.gomez', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Pedro Gómez Ruiz');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1065432109', 'Pedro Gómez Ruiz', 'Contaduría Pública', 'pedro.gomez@uts.edu.co', '3156543210', 
        (SELECT id FROM usuarios WHERE username = 'pedro.gomez'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1065432109'), 
    215, 43, 44, 42, 42, 44, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'INTERMEDIO'),
    'Desempeño equilibrado en todas las competencias'
);

-- Estudiante 5: BÁSICO (Puntaje 195)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('carlos.ramirez', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Carlos Ramírez Díaz');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1054321098', 'Carlos Ramírez Díaz', 'Ingeniería Electrónica', 'carlos.ramirez@uts.edu.co', '3198765432', 
        (SELECT id FROM usuarios WHERE username = 'carlos.ramirez'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1054321098'), 
    195, 38, 40, 39, 38, 40, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'BÁSICO'),
    'Resultado satisfactorio'
);

-- Estudiante 6: BÁSICO (Puntaje 185)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('laura.sanchez', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Laura Sánchez Mora');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1043210987', 'Laura Sánchez Mora', 'Derecho', 'laura.sanchez@uts.edu.co', '3187654321', 
        (SELECT id FROM usuarios WHERE username = 'laura.sanchez'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1043210987'), 
    185, 37, 38, 37, 36, 37, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'BÁSICO'),
    'Cumple con los requisitos mínimos'
);

-- Estudiante 7: SIN BENEFICIO (Puntaje 165)
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('diego.morales', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Diego Morales Castro');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1032109876', 'Diego Morales Castro', 'Arquitectura', 'diego.morales@uts.edu.co', '3176543210', 
        (SELECT id FROM usuarios WHERE username = 'diego.morales'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1032109876'), 
    165, 32, 34, 33, 33, 33, 
    '2024-11-01', '2024-2', 
    NULL,
    'No califica para beneficios'
);

-- Estudiante 8: SOBRESALIENTE (Puntaje 270) - Mejor puntaje
INSERT INTO usuarios (username, password, role, activo, nombre_completo) 
VALUES ('sofia.rojas', '$2a$10$8z.MpN5KrLXU7kGP6kBTAONBfF0OqYdNJrZj3h.ZJN0k7qLqQF3m2', 'ESTUDIANTE', 1, 'Sofía Rojas Hernández');

INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, telefono, usuario_id) 
VALUES ('1021098765', 'Sofía Rojas Hernández', 'Medicina', 'sofia.rojas@uts.edu.co', '3165432109', 
        (SELECT id FROM usuarios WHERE username = 'sofia.rojas'));

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id, observaciones) 
VALUES (
    (SELECT id FROM estudiantes WHERE identificacion = '1021098765'), 
    270, 55, 56, 54, 52, 53, 
    '2024-11-01', '2024-2', 
    (SELECT id FROM beneficios WHERE categoria = 'SOBRESALIENTE'),
    '¡Mejor puntaje de la cohorte!'
);

-- =====================================================
-- CONSULTAS DE VERIFICACIÓN
-- =====================================================

-- Ver todos los estudiantes con sus puntajes
SELECT 
    e.identificacion,
    e.nombre_completo,
    e.programa,
    r.puntaje_global,
    b.nombre_beneficio,
    b.categoria
FROM estudiantes e
LEFT JOIN resultados_saber_pro r ON e.id = r.estudiante_id
LEFT JOIN beneficios b ON r.beneficio_id = b.id
ORDER BY r.puntaje_global DESC;

-- Estadísticas generales
SELECT 
    COUNT(*) as total_estudiantes,
    ROUND(AVG(puntaje_global), 2) as promedio_general,
    MAX(puntaje_global) as puntaje_maximo,
    MIN(puntaje_global) as puntaje_minimo,
    SUM(CASE WHEN puntaje_global >= 241 THEN 1 ELSE 0 END) as sobresalientes,
    SUM(CASE WHEN puntaje_global BETWEEN 211 AND 240 THEN 1 ELSE 0 END) as intermedios,
    SUM(CASE WHEN puntaje_global BETWEEN 180 AND 210 THEN 1 ELSE 0 END) as basicos,
    SUM(CASE WHEN puntaje_global < 180 THEN 1 ELSE 0 END) as sin_beneficio
FROM resultados_saber_pro;

-- Distribución por programa
SELECT 
    e.programa,
    COUNT(*) as cantidad,
    ROUND(AVG(r.puntaje_global), 2) as promedio
FROM estudiantes e
JOIN resultados_saber_pro r ON e.id = r.estudiante_id
GROUP BY e.programa
ORDER BY promedio DESC;

-- =====================================================
-- NOTAS IMPORTANTES
-- =====================================================
-- Password para todos los usuarios: 123456
-- Los beneficios se asignan automáticamente por el sistema
-- Para hacer login como estudiante, usa:
--   Usuario: identificación del estudiante (ej: juan.perez)
--   Password: 123456
