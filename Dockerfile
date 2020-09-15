#FrontEnd
FROM node:12 as node
# Create app directory
WORKDIR /app/front
# Install app dependencies
# A wildcard is used to ensure both package.json AND package-lock.json are copied
# where available (npm@5+)
COPY kodiatech-front/package.json ./
RUN npm install
COPY kodiatech-front/ ./
RUN npm run build
# If you are building your code for production
# RUN npm ci --only=production
# Bundle app source
   







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
COPY --from=node /app/front/dist /tmp/src/main/resources/static
# build for release
# NOTE: "date-format-java-" must be replaced with the proper prefix
RUN mvn -Dmaven.test.skip=true package && cp target/kodiatech.jar kodiatech.jar




FROM openjdk:8
#ADD kodiatech/target/kodiatech.jar kodiatech.jar
EXPOSE 8080
COPY --from=MAVEN_IMAGE /tmp/kodiatech.jar ./kodiatech.jar
ENTRYPOINT ["java", "-jar", "/kodiatech.jar"]