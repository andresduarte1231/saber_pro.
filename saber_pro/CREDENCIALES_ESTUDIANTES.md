# CREDENCIALES DE ACCESO - ESTUDIANTES SABER PRO 2025

## 📋 Información General

Todos los estudiantes del informe han sido cargados automáticamente en la base de datos con las siguientes credenciales:

- **Usuario**: Primera letra del primer nombre + primer apellido (en minúsculas)
- **Contraseña**: Número de documento de identidad

## 👥 Lista Completa de Estudiantes y Credenciales

### Estudiantes con Beneficio (Puntaje 180-210)

| # | Nombre Completo | Usuario | Contraseña | Puntaje | Beneficio |
|---|-----------------|---------|------------|---------|-----------|
| 1 | Miguel Iván Barbosa Ramírez | `mbarbosa` | `31453462` | 200 | Beneficio 1 (4.5) |

### Estudiantes sin Beneficio (Puntaje < 180)

| # | Nombre Completo | Usuario | Contraseña | Puntaje |
|---|-----------------|---------|------------|---------|
| 2 | Felipe Adrián Quintero Gómez | `fquintero` | `75550526` | 165 |
| 3 | Andrés Alejandro Parra Mejía | `aparra` | `46698108` | 164 |
| 4 | Juan David Anaya Gómez | `janaya` | `45231533` | 160 |
| 5 | Miguel Felipe Flor Martínez | `mflor` | `53316653` | 160 |
| 6 | Mateo Felipe Garcia Ramírez | `mgarcia` | `91135112` | 157 |
| 7 | Juan Santiago Manosalva Torres | `jmanosalva` | `26677860` | 153 |
| 8 | Mateo Andrés Mendoza García | `mmendoza` | `73009480` | 151 |
| 9 | Juan David Beltran Duarte | `jbeltran` | `50943227` | 150 |
| 10 | Daniel Esteban Santamaria Duarte | `dsantamaria` | `70914222` | 150 |
| 11 | Jorge Esteban Sanchez Torres | `jsanchez` | `15273778` | 149 |
| 12 | Mateo Andrés Romero Martínez | `mromero` | `17779199` | 146 |
| 13 | Miguel Santiago Luna Gómez | `mluna` | `39720157` | 141 |
| 14 | Daniel Adrián Triana Ramírez | `dtriana` | `67517549` | 141 |
| 15 | Andrés Ricardo Suarez Torres | `asuarez` | `44147736` | 140 |
| 16 | Sebastián Santiago Garcia Rojas | `sgarcia` | `79605902` | 139 |
| 17 | Felipe Santiago Pinzon Castro | `fpinzon` | `13884706` | 138 |
| 18 | Sebastián Andrés Jaimes Duarte | `sjaimes` | `79915130` | 137 |
| 19 | Sebastián Alejandro Niño Martínez | `snino` | `49993219` | 134 |
| 20 | Sebastián Alejandro Fabian Pérez | `sfabian` | `30151092` | 133 |
| 21 | Felipe Santiago Hernandez Rojas | `fhernandez` | `58256132` | 132 |
| 22 | Mateo Santiago Larios Mejía | `mlarios` | `97771805` | 131 |
| 23 | Daniel Alejandro Calderon Ramírez | `dcalderon` | `54829852` | 130 |
| 24 | Luis Camilo Villarreal Gómez | `lvillarreal` | `47611764` | 129 |
| 25 | Jorge Ricardo Restrepo Duarte | `jrestrepo` | `30485073` | 126 |
| 26 | Andrés Adrián Caceres Pérez | `acaceres` | `64940712` | 125 |
| 27 | Mateo Iván Tabares Gómez | `mtabares` | `29920061` | 124 |
| 28 | Miguel Ricardo Naranjo Ramírez | `mnaranjo` | `33078361` | 122 |
| 29 | Miguel Esteban Prada García | `mprada` | `35850972` | 122 |
| 30 | Sebastián Andrés Vargas Duarte | `svargas` | `89144805` | 114 |
| 31 | Carlos Ricardo Torres Martínez | `ctorres` | `83126639` | 113 |
| 32 | Daniel Ricardo Ortiz Mejía | `dortiz` | `11937851` | 107 |
| 33 | Jorge Esteban Villamizar García | `jvillamizar` | `99250637` | 106 |
| 34 | Felipe Iván Restrepo Rojas | `frestrepo` | `90110748` | 96 |

## 🔐 Credenciales de Administración

| Rol | Usuario | Contraseña |
|-----|---------|------------|
| Administrador | `admin` | `admin123` |
| Coordinador | `coordinador` | `coord123` |

## 📊 Ejemplos de Acceso

### Ejemplo 1: Estudiante con beneficio
```
Usuario: mbarbosa
Contraseña: 31453462
```
Este estudiante podrá ver:
- Puntaje global: 200
- Beneficio asignado: Beneficio 1 (Nota Seminario: 4.5)
- Detalle de todos sus puntajes por competencia

### Ejemplo 2: Estudiante sin beneficio
```
Usuario: fquintero
Contraseña: 75550526
```
Este estudiante podrá ver:
- Puntaje global: 165
- Sin beneficio asignado
- Detalle de todos sus puntajes por competencia

## ✅ Verificación de Datos

**Total de estudiantes cargados**: 34

**Distribución de beneficios**:
- Beneficio 1 (180-210 puntos): 1 estudiante
- Beneficio 2 (211-240 puntos): 0 estudiantes
- Beneficio 3 (241+ puntos): 0 estudiantes
- Sin beneficio (< 180 puntos): 33 estudiantes

## 🚀 Cómo Probar

1. Ejecutar la aplicación: `mvnw spring-boot:run`
2. Abrir navegador en: `http://localhost:8080`
3. Ingresar con cualquier estudiante usando las credenciales de la tabla
4. Verificar que se muestre correctamente su información

## 📝 Notas Importantes

- Las contraseñas están encriptadas con BCrypt en la base de datos
- Los estudiantes solo pueden ver su propia información
- El coordinador puede ver todos los estudiantes y generar reportes
- El administrador puede gestionar todos los usuarios

---

**Fecha de carga**: Automática al iniciar la aplicación por primera vez
**Fuente**: INFORME_SABER_PRO_2025_COMPLETO.txt
