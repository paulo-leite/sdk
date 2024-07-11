plugins {
	id("org.springframework.boot") version "3.2.5" apply false
	id("io.spring.dependency-management") version "1.1.4"
	java
	checkstyle
}

group = "br.com.intelbras.easybuilder"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
	maven {
		url = uri("https://github.com/paulo-leite/sdk")
		credentials {
			username = findProperty("repoUser") as String? ?: "defaultUser"
			password = findProperty("repoPassword") as String? ?: "defaultPassword"
		}
	}
}

dependencyManagement {
	imports {
		mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.named<Jar>("jar") {
	archiveFileName.set("${project.name}.jar")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
