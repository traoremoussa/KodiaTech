# Stage 1
FROM node:10-alpine as build-step
RUN mkdir -p /app
WORKDIR /app
COPY package.json /app

RUN npm install
COPY . /app
RUN npm run build

### STAGE 2: Run ###
FROM nginx:1.17.1-alpine as prod-Stage

COPY --from=build-step /app/dist/kodiatech-front /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g","daemon off;"]
