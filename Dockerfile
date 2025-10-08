FROM eclipse-temurin:17-jdk

WORKDIR /app

# copy any jar file built by Gradle
COPY build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
