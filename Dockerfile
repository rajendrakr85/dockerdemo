FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD target/DockerDemo-0.0.1-SNAPSHOT.jar DockerDemo.jar
ENTRYPOINT ["java","-jar","/DockerDemo.jar"]