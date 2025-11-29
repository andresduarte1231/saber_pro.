# ====== Etapa de build ======
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiamos el pom primero para cache de dependencias
COPY pom.xml .
# Descargamos dependencias (sin compilar código aún)
RUN mvn -q -DskipTests dependency:go-offline

# Copiamos el código fuente
COPY src ./src

# Compilamos y empaquetamos (saldrá un JAR en target/)
RUN mvn -DskipTests package

# ====== Etapa runtime mínima ======
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copiamos el JAR generado (usa wildcard para no depender del nombre exacto)
# Ajusta *SNAPSHOT*.jar si tu JAR no es SNAPSHOT; puedes usar *.jar
COPY --from=build /app/target/*.jar app.jar

# Puerto interno donde correrá Spring Boot
EXPOSE 8080

# Opcional: variable para tunear JVM desde el panel de Render
ENV JAVA_OPTS=""

# ENTRYPOINT permite inyectar JAVA_OPTS
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
