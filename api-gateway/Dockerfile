from eclipse-termurin:21-jre 

workdir /app

copy target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar

entrypoint ["java", "-jar", "api-gateway.jar"]