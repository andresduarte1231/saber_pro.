# Sistema de Gestión Saber Pro - UTS

## 📋 Descripción
Sistema completo de gestión de resultados Saber Pro desarrollado con Spring Boot, MySQL y Thymeleaf. Implementa el sistema de beneficios según el **Acuerdo No. 01-009 (22 de abril de 2024)** del Consejo Directivo UTS.

## 🚀 Características Principales

### 👨‍💼 Panel de Administrador
- **Gestión completa de usuarios** (Crear, Editar, Eliminar, Activar/Desactivar)
- Asignación de roles: Admin, Coordinador, Estudiante
- Dashboard con estadísticas
- Cambio de contraseña

### 👔 Panel de Coordinador
- **CRUD de Alumnos** - Gestión de estudiantes y resultados
- **Informe de Alumnos** - Lista completa de resultados
- **Informe Detallado** - Estadísticas y gráficos
- **Informe de Beneficios** - Estudiantes beneficiados por categoría
- Cambio de contraseña

### 🎓 Panel de Estudiante
- **Dashboard personalizado** con información del estudiante
- **Mi Resultado** - Visualización completa con gráficos
- **Mis Beneficios** - Detalle de beneficios obtenidos según puntaje
- Cambio de contraseña

## 🎯 Sistema de Beneficios Automático

El sistema asigna automáticamente beneficios según el puntaje:

### 📊 Puntaje 180-210 (BÁSICO)
- ✅ Exoneración de informe final de trabajo de grado
- ✅ Nota de Seminario: **4.5**
- 💰 Beca: **0%**

### 📊 Puntaje 211-240 (INTERMEDIO)
- ✅ Exoneración de informe final de trabajo de grado
- ✅ Nota de Seminario: **4.7**
- 💰 Beca: **50%** sobre derechos de grado

### 📊 Puntaje 241+ (SOBRESALIENTE)
- ✅ Exoneración de informe final de trabajo de grado
- ✅ Nota de Seminario: **5.0**
- 💰 Beca: **100%** sobre derechos de grado

## 🛠️ Tecnologías Utilizadas

- **Backend:** Spring Boot 4.0.0, Java 17
- **Security:** Spring Security 6
- **Base de Datos:** MySQL 8.0
- **ORM:** Spring Data JPA / Hibernate
- **Frontend:** Thymeleaf, Bootstrap 5.3.2
- **Gráficos:** Chart.js
- **Iconos:** Font Awesome 6.4.0

## 📦 Requisitos Previos

- Java JDK 17 o superior
- MySQL 8.0 o superior
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## ⚙️ Configuración e Instalación

### 1. Configurar Base de Datos MySQL

```sql
-- La base de datos se crea automáticamente
-- Solo asegúrate de que MySQL esté corriendo en el puerto 3306
```

### 2. Configurar `application.properties`

El archivo ya está configurado. Solo verifica tu contraseña de MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/saberpro_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=      # <- Cambia esto si tienes contraseña
```

### 3. Ejecutar el Proyecto

```bash
# Opción 1: Desde la línea de comandos
mvn spring-boot:run

# Opción 2: Desde tu IDE
# Ejecutar la clase SaberProApplication.java
```

### 4. Acceder al Sistema

Abre tu navegador en: **http://localhost:8080**

## 👤 Usuarios por Defecto

El sistema crea automáticamente estos usuarios:

### Administrador
- **Usuario:** `admin`
- **Contraseña:** `admin123`
- **Rol:** ADMIN

### Coordinador
- **Usuario:** `coordinador`
- **Contraseña:** `coord123`
- **Rol:** COORDINADOR

## 📊 Datos de Prueba

Para probar el sistema, puedes crear estudiantes con los siguientes datos:

### Ejemplo 1: Estudiante Sobresaliente
1. Login como **admin**
2. Crear usuario:
   - Username: `juan.perez`
   - Password: `123456`
   - Nombre: `Juan Pérez García`
   - Rol: `ESTUDIANTE`
   - Identificación: `1098765432`

3. Insertar resultado en la base de datos:
```sql
INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, usuario_id) 
VALUES ('1098765432', 'Juan Pérez García', 'Ingeniería de Sistemas', 'juan@uts.edu.co', 3);

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) 
VALUES (1, 255, 52, 54, 50, 48, 51, '2024-11-01', '2024-2', 3);
```

### Ejemplo 2: Estudiante Intermedio
```sql
INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, usuario_id) 
VALUES ('1087654321', 'María López Torres', 'Administración de Empresas', 'maria@uts.edu.co', 4);

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) 
VALUES (2, 225, 45, 47, 44, 43, 46, '2024-11-01', '2024-2', 2);
```

### Ejemplo 3: Estudiante Básico
```sql
INSERT INTO estudiantes (identificacion, nombre_completo, programa, correo, usuario_id) 
VALUES ('1076543210', 'Carlos Ramírez Díaz', 'Contaduría Pública', 'carlos@uts.edu.co', 5);

INSERT INTO resultados_saber_pro 
(estudiante_id, puntaje_global, comunicacion_escrita, razonamiento_cuantitativo, 
lectura_critica, competencias_ciudadanas, ingles, fecha_prueba, periodo, beneficio_id) 
VALUES (3, 195, 38, 40, 39, 38, 40, '2024-11-01', '2024-2', 1);
```

## 🎨 Diseño Profesional

El sistema cuenta con:
- ✨ Animaciones suaves y transiciones
- 📱 Diseño responsive (adaptable a móviles y tablets)
- 🎨 Paleta de colores profesional de UTS
- 📊 Gráficos interactivos con Chart.js
- 🖼️ Iconos de Font Awesome
- 💫 Efectos hover y animaciones CSS

## 📂 Estructura del Proyecto

```
saber_pro/
├── src/main/java/com/saberpro/app/
│   ├── config/          # Configuración e inicialización
│   ├── controller/      # Controladores MVC
│   ├── model/           # Entidades JPA
│   ├── repository/      # Repositorios JPA
│   ├── security/        # Configuración de seguridad
│   └── service/         # Lógica de negocio
├── src/main/resources/
│   ├── static/css/      # Estilos CSS
│   ├── templates/       # Vistas Thymeleaf
│   └── application.properties
└── pom.xml
```

## 🔒 Seguridad

- Autenticación basada en Spring Security
- Contraseñas encriptadas con BCrypt
- Roles y permisos por endpoint
- Sesiones seguras
- Protección CSRF habilitada

## 📝 Funcionalidades Destacadas

### Sistema de Roles
- **ADMIN:** Gestión completa de usuarios
- **COORDINADOR:** Visualización y gestión de resultados
- **ESTUDIANTE:** Consulta de resultados personales

### Cálculo Automático de Beneficios
El sistema asigna automáticamente el beneficio correspondiente al guardar/actualizar un resultado según el puntaje global.

### Informes y Estadísticas
- Promedio general de puntajes
- Distribución por categorías
- Conteo de estudiantes sobresalientes
- Gráficos interactivos

## 🐛 Solución de Problemas

### Error de conexión a MySQL
```
Verifica que MySQL esté corriendo y las credenciales sean correctas
```

### Puerto 8080 ocupado
```properties
# En application.properties, cambia el puerto:
server.port=8081
```

### Tablas no se crean
```properties
# Verifica que tengas esto en application.properties:
spring.jpa.hibernate.ddl-auto=update
```

## 📞 Soporte

Para cualquier duda o problema:
- Revisa la documentación del código
- Verifica los logs de la aplicación
- Contacta al equipo de desarrollo

## 📄 Licencia

Este proyecto es desarrollado para fines académicos y administrativos de la UTS.

---

**Desarrollado con ❤️ para la Universidad Tecnológica de Santander (UTS)**
