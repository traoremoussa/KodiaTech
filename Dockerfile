# Build front
FROM node:10.15.3-alpine as nodejs
WORKDIR /app
COPY ./src/main/front ./kodiatech-front
RUN cd front \
    && npm install -g @angular/cli \
    && npm update \
    && npm run build \
    && mv dist /app/angular



   # on creer image stocker dans MAVEN_IMAGE
FROM maven:3.5-jdk-8 AS MAVEN_IMAGE
      # creer work espace 
WORKDIR /tmp/
      # copy the Project Object Model file
COPY kodiatech/pom.xml /tmp/
      # fetch all dependencies
RUN mvn dependency:go-offline -B
     # copy your other files
COPY kodiatech/src /tmp/src/
COPY --from=nodejs /app/front/dist /tmp/src/main/resources/static
# build for release
# NOTE: "date-format-java-" must be replaced with the proper prefix
RUN mvn -Dmaven.test.skip=true package && cp target/kodiatech.jar kodiatech.jar




FROM openjdk:8
#ADD kodiatech/target/kodiatech.jar kodiatech.jar
EXPOSE 8080
COPY --from=MAVEN_IMAGE /tmp/kodiatech.jar ./kodiatech.jar
ENTRYPOINT ["java", "-jar", "/kodiatech.jar"]