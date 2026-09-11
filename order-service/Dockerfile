from eclipse-termurin:21-jre 

workdir /app

copy target/order-service-0.0.1-SNAPSHOT.jar order-service.jar

entrypoint ["java", "-jar", "order-service.jar"]