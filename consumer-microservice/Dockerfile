FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
EXPOSE 8090
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]