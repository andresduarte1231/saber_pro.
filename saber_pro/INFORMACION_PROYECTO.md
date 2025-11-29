# 📋 INFORMACIÓN DEL PROYECTO - Sistema Saber Pro UTS

## 📖 Descripción General

Sistema completo de gestión de resultados Saber Pro desarrollado para la **Universidad Tecnológica de Santander (UTS)**, que implementa el sistema de beneficios establecido en el **Acuerdo No. 01-009 del 22 de abril de 2024** del Consejo Directivo.

## 🎯 Objetivos Cumplidos

### ✅ Requerimientos Funcionales

#### 1. Sistema de Login y Autenticación
- ✅ Login seguro con Spring Security
- ✅ Encriptación de contraseñas con BCrypt
- ✅ Cambio de contraseña para todos los usuarios
- ✅ Sesiones seguras y protección CSRF

#### 2. Dashboard de Administrador
- ✅ **CRUD completo de usuarios** (Crear, Leer, Actualizar, Eliminar)
- ✅ **Gestión de roles**: ADMIN, COORDINADOR, ESTUDIANTE
- ✅ Activar/Desactivar usuarios
- ✅ Estadísticas del sistema
- ✅ Panel de control intuitivo

#### 3. Dashboard de Coordinador
- ✅ **CRUD de Alumnos** con gestión de resultados
- ✅ **Informe de Alumnos** con tabla completa
- ✅ **Informe Detallado** con estadísticas y gráficos
- ✅ **Informe de Beneficios** clasificado por categorías
- ✅ Visualización de datos con Chart.js
- ✅ Filtros por rango de puntajes

#### 4. Dashboard de Estudiante
- ✅ **Consulta de resultado** por identificación
- ✅ **Visualización de beneficios** obtenidos según puntaje
- ✅ Gráficos de competencias individuales
- ✅ Información detallada del beneficio UTS
- ✅ Dashboard personalizado

### ✅ Requerimientos Técnicos

#### Base de Datos MySQL
- ✅ Conexión a MySQL dentro de Spring Boot
- ✅ Modelo de datos completo:
  - `usuarios` (con roles y autenticación)
  - `estudiantes` (información personal)
  - `resultados_saber_pro` (puntajes y competencias)
  - `beneficios` (según Acuerdo UTS)
- ✅ Relaciones entre entidades correctamente definidas
- ✅ Creación automática de tablas con JPA/Hibernate

#### Sistema de Beneficios Automático
- ✅ **Puntaje 180-210**: Nota 4.5, Sin beca
- ✅ **Puntaje 211-240**: Nota 4.7, Beca 50%
- ✅ **Puntaje 241+**: Nota 5.0, Beca 100%
- ✅ Asignación automática al guardar resultados
- ✅ Información completa del Acuerdo No. 01-009

#### Diseño Profesional
- ✅ **Bootstrap 5.3.2** para diseño responsive
- ✅ **Font Awesome 6.4.0** para iconografía
- ✅ **Chart.js** para gráficos interactivos
- ✅ **CSS personalizado** con animaciones
- ✅ Paleta de colores profesional
- ✅ Diseño adaptable (móviles, tablets, desktop)
- ✅ Transiciones suaves y efectos hover
- ✅ Experiencia de usuario optimizada

## 🏗️ Arquitectura del Sistema

### Patrón MVC (Model-View-Controller)

```
┌─────────────────────────────────────────────┐
│           CAPA DE PRESENTACIÓN              │
│  (Thymeleaf Templates + Bootstrap + CSS)    │
└──────────────────┬──────────────────────────┘
                   │
┌──────────────────▼──────────────────────────┐
│          CAPA DE CONTROLADORES              │
│  - LoginController                          │
│  - AdminController                          │
│  - CoordinadorController                    │
│  - EstudianteController                     │
└──────────────────┬──────────────────────────┘
                   │
┌──────────────────▼──────────────────────────┐
│           CAPA DE SERVICIOS                 │
│  - UsuarioService                           │
│  - EstudianteService                        │
│  - ResultadoSaberProService                 │
│  - BeneficioService                         │
└──────────────────┬──────────────────────────┘
                   │
┌──────────────────▼──────────────────────────┐
│         CAPA DE REPOSITORIOS                │
│  - UsuarioRepository (JPA)                  │
│  - EstudianteRepository (JPA)               │
│  - ResultadoSaberProRepository (JPA)        │
│  - BeneficioRepository (JPA)                │
└──────────────────┬──────────────────────────┘
                   │
┌──────────────────▼──────────────────────────┐
│           BASE DE DATOS MySQL               │
│  - saberpro_db                              │
└─────────────────────────────────────────────┘
```

### Seguridad (Spring Security)

```
Usuario → Login → Spring Security
                      │
                      ├─→ Valida credenciales
                      ├─→ Verifica roles
                      ├─→ Crea sesión
                      │
                      └─→ Redirige según rol:
                            - ADMIN → /admin/dashboard
                            - COORDINADOR → /coordinador/dashboard
                            - ESTUDIANTE → /estudiante/dashboard
```

## 📊 Modelo de Datos

### Entidad Usuario
```java
- id (Long, PK)
- username (String, Unique)
- password (String, Encrypted)
- role (Enum: ADMIN, COORDINADOR, ESTUDIANTE)
- nombreCompleto (String)
- activo (Boolean)
```

### Entidad Estudiante
```java
- id (Long, PK)
- identificacion (String, Unique)
- nombreCompleto (String)
- programa (String)
- correo (String)
- telefono (String)
- usuario_id (Long, FK → Usuario)
```

### Entidad ResultadoSaberPro
```java
- id (Long, PK)
- estudiante_id (Long, FK → Estudiante)
- puntajeGlobal (Integer)
- comunicacionEscrita (Integer)
- razonamientoCuantitativo (Integer)
- lecturaCritica (Integer)
- competenciasCiudadanas (Integer)
- ingles (Integer)
- fechaPrueba (Date)
- periodo (String)
- beneficio_id (Long, FK → Beneficio)
- observaciones (String)
```

### Entidad Beneficio
```java
- id (Long, PK)
- nombreBeneficio (String)
- descripcion (Text)
- puntajeMinimo (Integer)
- puntajeMaximo (Integer)
- notaSeminario (String: "4.5", "4.7", "5.0")
- exoneracionTrabajoGrado (Boolean)
- exoneracionSeminario (Boolean)
- porcentajeBecaDerechos (Integer: 0, 50, 100)
- categoria (String: "BÁSICO", "INTERMEDIO", "SOBRESALIENTE")
```

## 🔒 Seguridad Implementada

### Autenticación
- ✅ Contraseñas encriptadas con BCrypt
- ✅ Sesiones HTTP seguras
- ✅ Protección contra CSRF
- ✅ Logout seguro con invalidación de sesión

### Autorización
- ✅ Control de acceso basado en roles
- ✅ Rutas protegidas por rol:
  - `/admin/**` → Solo ADMIN
  - `/coordinador/**` → Solo COORDINADOR
  - `/estudiante/**` → Solo ESTUDIANTE
- ✅ Redirección automática según permisos

## 📈 Funcionalidades Destacadas

### 1. Asignación Automática de Beneficios
El sistema calcula y asigna automáticamente el beneficio correspondiente cuando se guarda o actualiza un resultado:

```java
public ResultadoSaberPro guardar(ResultadoSaberPro resultado) {
    asignarBeneficio(resultado);  // Asignación automática
    return resultadoRepository.save(resultado);
}
```

### 2. Cálculo de Estadísticas en Tiempo Real
- Promedio general de puntajes
- Conteo de estudiantes por categoría
- Distribución por rangos de puntaje
- Gráficos interactivos con Chart.js

### 3. Informes Dinámicos
- **Informe de Alumnos**: Lista completa con detalles
- **Informe Detallado**: Tabla con todas las competencias
- **Informe de Beneficios**: Clasificación por categoría

### 4. Diseño Responsive
El sistema se adapta automáticamente a:
- 📱 Móviles (< 768px)
- 📱 Tablets (768px - 1024px)
- 💻 Desktop (> 1024px)

## 🎨 Paleta de Colores UTS

```css
--primary-color: #0d6efd    /* Azul principal */
--success-color: #28a745    /* Verde éxito */
--warning-color: #ffc107    /* Amarillo advertencia */
--info-color: #17a2b8       /* Azul información */
--danger-color: #dc3545     /* Rojo peligro */
```

## 📱 Páginas Implementadas

### Públicas
- `/login` - Página de inicio de sesión

### Administrador (7 páginas)
- `/admin/dashboard` - Panel principal
- `/admin/usuarios` - Lista de usuarios
- `/admin/usuarios/nuevo` - Crear usuario
- `/admin/usuarios/editar/{id}` - Editar usuario
- `/admin/cambiar-contrasena` - Cambiar contraseña

### Coordinador (5 páginas)
- `/coordinador/dashboard` - Panel principal
- `/coordinador/alumnos` - CRUD de alumnos
- `/coordinador/informe-detallado` - Estadísticas
- `/coordinador/informe-beneficios` - Beneficios por categoría
- `/coordinador/cambiar-contrasena` - Cambiar contraseña

### Estudiante (4 páginas)
- `/estudiante/dashboard` - Panel principal
- `/estudiante/resultado` - Mi resultado completo
- `/estudiante/beneficios` - Mis beneficios
- `/estudiante/cambiar-contrasena` - Cambiar contraseña

**Total: 17 páginas completamente funcionales**

## 🚀 Comandos Útiles

### Compilar el proyecto
```bash
.\mvnw.cmd clean compile
```

### Ejecutar el proyecto
```bash
.\mvnw.cmd spring-boot:run
```

### Crear JAR ejecutable
```bash
.\mvnw.cmd clean package
java -jar target/saber_pro-1.jar
```

### Limpiar compilación
```bash
.\mvnw.cmd clean
```

## 📦 Dependencias Principales

```xml
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- spring-boot-starter-security
- spring-boot-starter-thymeleaf
- spring-boot-starter-validation
- thymeleaf-extras-springsecurity6
- mysql-connector-j
- lombok
- bootstrap 5.3.2 (CDN)
- chart.js (CDN)
- font-awesome 6.4.0 (CDN)
```

## 🎯 Logros del Proyecto

✅ Sistema completo de gestión de resultados Saber Pro  
✅ 3 dashboards diferenciados por rol  
✅ Sistema de beneficios automático según Acuerdo UTS  
✅ Base de datos MySQL integrada  
✅ Seguridad robusta con Spring Security  
✅ Diseño profesional y responsive  
✅ 17 páginas funcionales  
✅ Gráficos interactivos  
✅ Animaciones y transiciones suaves  
✅ Código limpio y bien estructurado  
✅ Documentación completa  

## 📞 Soporte y Mantenimiento

### Archivos de Ayuda Incluidos
- `README.md` - Documentación completa
- `INICIO_RAPIDO.md` - Guía de inicio rápido
- `datos_prueba.sql` - Script con datos de prueba
- `INFORMACION_PROYECTO.md` - Este archivo

### Contacto
Para dudas o soporte técnico, contacta al equipo de desarrollo o al coordinador académico.

---

**Desarrollado con dedicación para la UTS** 🎓  
**Spring Boot + MySQL + Thymeleaf + Bootstrap** ⚡  
**Sistema listo para producción** ✅
