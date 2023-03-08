FROM openjdk:15-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 9090
COPY ${JAR_FILE} designpattern-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/designpattern-0.0.1-SNAPSHOT.jar"]
