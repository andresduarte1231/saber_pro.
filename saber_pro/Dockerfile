FROM gradle:8.5-jdk17-alpine AS build
WORKDIR /app
COPY build.gradle settings.gradle gradle.properties ./
COPY gradlew ./
COPY gradle ./gradle
RUN ./gradlew --no-daemon dependencies || true
COPY src ./src
RUN ./gradlew --no-daemon bootJar -x test

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
