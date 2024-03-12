FROM azul/zulu-openjdk-alpine:8
EXPOSE 8081
ADD ./target/*.jar ./app.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
