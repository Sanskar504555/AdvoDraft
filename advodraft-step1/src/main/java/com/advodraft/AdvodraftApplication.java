package com.advodraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ═══════════════════════════════════════════════════════════════════
 * MAIN APPLICATION CLASS - Your App Starts Here!
 * ═══════════════════════════════════════════════════════════════════
 * 
 * WHAT HAPPENS WHEN YOU RUN THIS:
 * 1. Java calls main() method (like any Java program)
 * 2. SpringApplication.run() starts Spring Boot
 * 3. Spring scans for components (@Controller, @Service, etc.)
 * 4. Starts embedded Tomcat server on port 8080
 * 5. Your app is ready to handle requests!
 * 
 * @SpringBootApplication EXPLAINED:
 * This ONE annotation is actually THREE annotations combined:
 * 
 * 1. @Configuration - This class can define beans
 * 2. @EnableAutoConfiguration - Spring Boot auto-configures based on dependencies
 * 3. @ComponentScan - Scans this package for @Component, @Controller, etc.
 * 
 * INTERVIEW QUESTION:
 * Q: What does @SpringBootApplication do?
 * A: "It combines @Configuration, @EnableAutoConfiguration, and @ComponentScan.
 *     It tells Spring to auto-configure the application and scan for components."
 * 
 * ═══════════════════════════════════════════════════════════════════
 */
@SpringBootApplication  // The magic annotation that makes Spring Boot work!
public class AdvodraftApplication {

    /**
     * MAIN METHOD - Entry point of your application
     * 
     * @param args - Command line arguments (if any)
     * 
     * When you run: mvn spring-boot:run
     * This method is called!
     */
    public static void main(String[] args) {
        // Start Spring Boot application
        SpringApplication.run(AdvodraftApplication.class, args);
        
        // This prints after the app starts
        System.out.println("\n✅ Advodraft is running on http://localhost:8080\n");
    }
}
