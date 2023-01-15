FROM amazoncorretto:11-alpine-jdk
MAINTAINER maximo
COPY target/mfc-0.0.1-SNAPSHOT.jar mfc-app.jar
ENTRYPOINT ["java","-jar","/mfc-app.jar"]