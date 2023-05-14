FROM amazoncorretto:8-jdk-alpine
MAINTAINER Shir07
COPY target/portafoliobackend-0.0.1-SNAPSHOT shir-app.jar
ENTRYPOINT ["java", "-jar","/shir-app.jar"]
