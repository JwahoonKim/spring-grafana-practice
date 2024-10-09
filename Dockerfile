# Dockerfile 예제
FROM openjdk:21-slim
COPY ./build/libs/spring-grafana-practice-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]