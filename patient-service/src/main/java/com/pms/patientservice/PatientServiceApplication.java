package com.pms.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication is a combination of three annotations:
// 1. @Configuration - Marks this class as a source of Spring configuration.
// 2. @EnableAutoConfiguration - Automatically configures Spring Boot based on dependencies.
// 3. @ComponentScan - Scans the package and sub-packages for components (Controller, Service, Repository).
@SpringBootApplication
public class PatientServiceApplication {

    // The main method is the starting point of the Spring Boot application.
    public static void main(String[] args) {

        // SpringApplication.run() bootstraps the application.
        // It sets up the Spring context, starts the embedded Tomcat server,
        // and makes the REST APIs available for use.
        SpringApplication.run(PatientServiceApplication.class, args);
    }
}
