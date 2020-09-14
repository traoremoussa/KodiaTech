FROM openjdk:8
ADD kodiatech/target/kodiatech.jar kodiatech.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/kodiatech.jar"]