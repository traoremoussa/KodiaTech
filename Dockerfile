

   # on creer image stocker dans MAVEN_IMAGE
FROM maven:3.5-jdk-8 AS MAVEN_IMAGE
      # creer work espace 
WORKDIR /app/back
      # copy the Project Object Model file
COPY ./kodiatech/pom.xml ./pom.xml
      # fetch all dependencies
RUN mvn dependency:go-offline -B
     # copy your other files
COPY ./kodiatech/src ./src
#COPY --from=build-step /app/front/dist ./src/main/resources/static
# build for release
# NOTE: "date-format-java-" must be replaced with the proper prefix
RUN mvn -Dmaven.test.skip=true package && cp target/kodiatech.jar kodiatech.jar




FROM openjdk:8
#ADD kodiatech/target/kodiatech.jar kodiatech.jar
EXPOSE 8080
COPY --from=MAVEN_IMAGE /app/back/kodiatech.jar ./kodiatech.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom -Xmx500m","-jar", "/kodiatech.jar"]