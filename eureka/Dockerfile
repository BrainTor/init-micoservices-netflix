from eclipse-termurin:21-jre 

workdir /app

copy target/eureka-0.0.1-SNAPSHOT.jar eureka.jar

entrypoint ["java", "-jar", "eureka.jar"]