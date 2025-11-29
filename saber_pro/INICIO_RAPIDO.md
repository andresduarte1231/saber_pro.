# 🚀 GUÍA RÁPIDA DE INICIO - Sistema Saber Pro UTS

## ⚡ Inicio Rápido (3 Pasos)

### 1️⃣ Asegúrate de tener MySQL corriendo
```bash
# Verifica que MySQL esté activo en el puerto 3306
# Usuario: root
# Contraseña: (vacía o tu contraseña)
```

### 2️⃣ Ejecuta la aplicación
```bash
# Desde la carpeta del proyecto, ejecuta:
.\mvnw.cmd spring-boot:run

# O si prefieres usar tu IDE:
# Ejecuta la clase: SaberProApplication.java
```

### 3️⃣ Abre tu navegador
```
http://localhost:8080
```

## 🔑 Credenciales de Acceso

### 👨‍💼 Administrador
- **Usuario:** `admin`
- **Contraseña:** `admin123`
- **Funciones:** Gestión completa de usuarios

### 👔 Coordinador
- **Usuario:** `coordinador`
- **Contraseña:** `coord123`
- **Funciones:** Ver informes y estadísticas

## 📊 Cargar Datos de Prueba

### Opción 1: Desde MySQL Workbench o línea de comandos
```sql
-- Conecta a MySQL y ejecuta:
source c:/Spring Sabados/saber_pro/datos_prueba.sql
```

### Opción 2: Manualmente desde el navegador
1. Login como `admin`
2. Ve a "Usuarios" → "Nuevo Usuario"
3. Crea estudiantes con:
   - Username: `juan.perez`
   - Password: `123456`
   - Rol: `ESTUDIANTE`
   - Identificación: `1098765432`

## 🎯 Estudiantes de Prueba (después de cargar datos)

| Usuario | Password | Puntaje | Beneficio |
|---------|----------|---------|-----------|
| juan.perez | 123456 | 255 | SOBRESALIENTE (5.0 + Beca 100%) |
| ana.martinez | 123456 | 245 | SOBRESALIENTE (5.0 + Beca 100%) |
| maria.lopez | 123456 | 225 | INTERMEDIO (4.7 + Beca 50%) |
| carlos.ramirez | 123456 | 195 | BÁSICO (4.5) |

## 🛠️ Solución de Problemas Comunes

### ❌ Error: "Cannot connect to database"
```properties
# Edita: src/main/resources/application.properties
# Cambia la contraseña de MySQL:
spring.datasource.password=TU_CONTRASEÑA_MYSQL
```

### ❌ Error: "Port 8080 already in use"
```properties
# Edita: src/main/resources/application.properties
# Cambia el puerto:
server.port=8081
```

### ❌ Error: "mvnw not found"
```bash
# Desde PowerShell/CMD, ejecuta:
.\mvnw.cmd spring-boot:run

# NO uses:
mvn spring-boot:run (a menos que tengas Maven instalado globalmente)
```

## 📱 Funcionalidades Principales

### Dashboard Administrador
- ✅ Crear/Editar/Eliminar usuarios
- ✅ Asignar roles (ADMIN, COORDINADOR, ESTUDIANTE)
- ✅ Ver estadísticas generales
- ✅ Cambiar contraseña

### Dashboard Coordinador
- ✅ Ver informe de alumnos (CRUD)
- ✅ Informe detallado con gráficos
- ✅ Informe de beneficios por categoría
- ✅ Estadísticas y promedios

### Dashboard Estudiante
- ✅ Ver mi resultado Saber Pro
- ✅ Ver mis beneficios según puntaje
- ✅ Gráficos de competencias
- ✅ Información personalizada

## 🎨 Características del Diseño

- 📱 **Responsive**: Se adapta a móviles, tablets y desktop
- 🎯 **Profesional**: Colores UTS, animaciones suaves
- 📊 **Gráficos**: Chart.js para visualización de datos
- ✨ **Animaciones**: Transiciones y efectos hover
- 🎨 **Bootstrap 5**: Framework CSS moderno

## 📂 Estructura de URLs

```
/login                          → Página de login
/dashboard                      → Redirección según rol

--- ADMIN ---
/admin/dashboard                → Dashboard administrador
/admin/usuarios                 → Lista de usuarios
/admin/usuarios/nuevo           → Crear usuario
/admin/usuarios/editar/{id}     → Editar usuario
/admin/cambiar-contrasena       → Cambiar contraseña

--- COORDINADOR ---
/coordinador/dashboard          → Dashboard coordinador
/coordinador/alumnos            → CRUD de alumnos
/coordinador/informe-detallado  → Estadísticas completas
/coordinador/informe-beneficios → Beneficios por categoría
/coordinador/cambiar-contrasena → Cambiar contraseña

--- ESTUDIANTE ---
/estudiante/dashboard           → Dashboard estudiante
/estudiante/resultado           → Ver mi resultado
/estudiante/beneficios          → Ver mis beneficios
/estudiante/cambiar-contrasena  → Cambiar contraseña
```

## 🔒 Sistema de Beneficios Automático

El sistema asigna automáticamente beneficios al guardar un resultado:

| Puntaje | Categoría | Nota | Beca |
|---------|-----------|------|------|
| 180-210 | BÁSICO | 4.5 | 0% |
| 211-240 | INTERMEDIO | 4.7 | 50% |
| 241+ | SOBRESALIENTE | 5.0 | 100% |

## 📞 Ayuda Adicional

### Ver logs de la aplicación
Los logs se muestran en la consola donde ejecutas el proyecto.

### Reiniciar la base de datos
```sql
DROP DATABASE saberpro_db;
-- Luego reinicia la aplicación (se creará automáticamente)
```

### Verificar que MySQL está corriendo
```bash
# Windows:
services.msc
# Busca: MySQL80 o MySQL

# O desde línea de comandos:
mysql -u root -p
```

## 🎓 Tecnologías Utilizadas

- ☕ Java 17
- 🍃 Spring Boot 3.2.0
- 🔒 Spring Security 6
- 🗄️ MySQL 8.0
- 🎨 Thymeleaf + Bootstrap 5
- 📊 Chart.js
- 🎯 Font Awesome 6

---

**¿Todo listo?** ¡Ejecuta `.\mvnw.cmd spring-boot:run` y accede a http://localhost:8080! 🚀
