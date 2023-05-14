FROM amazoncorretto:8
EXPOSE 8080
MAINTAINER Shir07
COPY target/portafoliobackend-0.0.1-SNAPSHOT.jar shir-app.jar
ENTRYPOINT ["java", "-jar","/shir-app.jar"]
