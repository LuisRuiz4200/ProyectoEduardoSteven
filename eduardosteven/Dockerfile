FROM azul/zulu-openjdk-alpine:8
VOLUME /tmp
EXPOSE 8081
COPY target/eduardosteven-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar

# Usa una imagen base de Maven
FROM maven:3.8.7

# Copia tu archivo de configuración de Maven personalizado (settings.xml) al contenedor
COPY settings.xml /root/.m2/settings.xml