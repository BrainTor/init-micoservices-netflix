plugins {
	java
	id("org.springframework.boot") version "3.4.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

extra["springCloudVersion"] = "2024.0.0"

dependencies {
	implementation(platform("org.springframework.boot:spring-boot-dependencies:3.4.0"))
	implementation(platform("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}"))

	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// dependency management via platform BOMs above

tasks.withType<Test> {
	useJUnitPlatform()
}
