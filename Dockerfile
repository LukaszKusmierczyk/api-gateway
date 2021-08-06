FROM adoptopenjdk/openjdk11

WORKDIR /app

EXPOSE 8080

COPY build/libs/api-gateway-1.0-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "api-gateway-1.0-SNAPSHOT.jar"]