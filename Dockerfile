FROM openjdk:17-alpine

ENV APP_NAME=clientes-app

WORKDIR /app

COPY ./target/${APP_NAME}.jar ./${APP_NAME}.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "clientes-app.jar"]
