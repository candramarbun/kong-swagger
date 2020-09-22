# For Java 8, try this
FROM openjdk:8-jdk-alpine

# Refer to Maven build -> finalName
ARG JAR_FILE=target/swagger-server.jar
ARG POM=pom.xml

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar
COPY ${POM} pom.xml

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]