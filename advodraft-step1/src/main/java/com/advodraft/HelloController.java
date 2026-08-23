package com.advodraft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ═══════════════════════════════════════════════════════════════════
 * YOUR FIRST REST CONTROLLER!
 * ═══════════════════════════════════════════════════════════════════
 * 
 * WHAT IS A CONTROLLER?
 * - Handles HTTP requests (GET, POST, PUT, DELETE)
 * - Like a waiter taking orders and bringing food
 * - Each method = one endpoint (URL)
 * 
 * @RestController EXPLAINED:
 * - Combines @Controller + @ResponseBody
 * - Tells Spring: "This class handles HTTP requests"
 * - Automatically converts return values to JSON
 * 
 * INTERVIEW:
 * Q: What's the difference between @Controller and @RestController?
 * A: "@Controller returns views (HTML pages), @RestController returns data (JSON).
 *     @RestController = @Controller + @ResponseBody"
 * 
 * ═══════════════════════════════════════════════════════════════════
 */
@RestController  // Marks this class as a REST API controller
public class HelloController {

    /**
     * YOUR FIRST ENDPOINT!
     * 
     * @GetMapping - Handles HTTP GET requests
     * 
     * When someone visits: http://localhost:8080/
     * This method runs and returns the string
     * 
     * BREAKDOWN:
     * - @GetMapping("/") means: respond to GET requests at "/"
     * - String return type: what we send back to the user
     * - Method name doesn't matter (Spring uses the annotation)
     * 
     * TRY IT:
     * 1. Run the app: mvn spring-boot:run
     * 2. Open browser: http://localhost:8080/
     * 3. You'll see: "Welcome to Advodraft! 🚀"
     */
    @GetMapping("/")  // This is the URL path
    public String home() {
        return "Welcome to Advodraft! 🚀 Your backend is running!";
    }

    /**
     * SECOND ENDPOINT - Get API status
     * 
     * URL: http://localhost:8080/status
     * 
     * INTERVIEW TIP:
     * Multiple @GetMapping methods = multiple endpoints
     * Each endpoint = different URL path
     */
    @GetMapping("/status")
    public String status() {
        return "Advodraft API - Status: RUNNING ✅";
    }
}
