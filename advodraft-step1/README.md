# 🎯 STEP 1: Your First Spring Boot Application

## What We're Building

A **minimal working Spring Boot app** with:
- ✅ One main class (entry point)
- ✅ One controller with 2 endpoints
- ✅ Basic configuration

**Goal:** Understand the absolute basics and see it work!

---

## 📁 Project Structure

```
advodraft-step1/
├── pom.xml                              # Maven configuration (dependencies)
├── src/
│   └── main/
│       ├── java/com/advodraft/
│       │   ├── AdvodraftApplication.java    # Main entry point
│       │   └── HelloController.java         # Your first REST controller
│       └── resources/
│           └── application.yml              # Configuration file
```

**That's it! Just 3 Java files to understand.**

---

## 🧠 Concepts You'll Learn

### 1. **@SpringBootApplication**
```java
@SpringBootApplication
public class AdvodraftApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvodraftApplication.class, args);
    }
}
```

**What it does:**
- Starts Spring Boot
- Scans for components (@Controller, @Service, etc.)
- Auto-configures based on dependencies
- Starts embedded Tomcat server

**Interview answer:**
> "@SpringBootApplication combines three annotations: @Configuration, @EnableAutoConfiguration, and @ComponentScan. It bootstraps the entire Spring application."

---

### 2. **@RestController**
```java
@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Welcome!";
    }
}
```

**What it does:**
- Handles HTTP requests
- Automatically converts return values to JSON (or text)
- Each method = one endpoint

**Why "Rest"?**
- REST = Representational State Transfer
- RESTful API = web service that follows REST principles
- Uses HTTP methods: GET, POST, PUT, DELETE

**Interview answer:**
> "@RestController combines @Controller and @ResponseBody. It tells Spring this class handles HTTP requests and returns data directly (not HTML views)."

---

### 3. **@GetMapping**
```java
@GetMapping("/status")
public String status() {
    return "RUNNING";
}
```

**What it does:**
- Maps HTTP GET requests to this method
- URL path: http://localhost:8080/status
- GET = retrieve data (doesn't modify anything)

**HTTP Methods:**
- GET - Retrieve data
- POST - Create new data
- PUT - Update existing data
- DELETE - Delete data

---

## 🚀 How to Run

### Option 1: Using Maven (Easiest)
```bash
# Navigate to project
cd advodraft-step1

# Run the application
mvn spring-boot:run

# You'll see:
# "✅ Advodraft is running on http://localhost:8080"
```

### Option 2: Using VS Code
1. Open folder in VS Code
2. Find `AdvodraftApplication.java`
3. Click the ▶️ "Run" button above the `main` method
4. OR press **F5**

---

## ✅ Test Your Endpoints

### 1. Using Browser
Open your browser and go to:
- http://localhost:8080/ 
  - You'll see: "Welcome to Advodraft! 🚀 Your backend is running!"
- http://localhost:8080/status
  - You'll see: "Advodraft API - Status: RUNNING ✅"

### 2. Using Terminal (curl)
```bash
# Test home endpoint
curl http://localhost:8080/

# Test status endpoint
curl http://localhost:8080/status
```

### 3. Using VS Code Extension (Thunder Client)
1. Install "Thunder Client" extension
2. New Request → GET → http://localhost:8080/
3. Send!

---

## 🧪 Experiment!

Try modifying the code:

### Change the message:
```java
@GetMapping("/")
public String home() {
    return "Hello from MY app!";  // Change this
}
```

### Add a new endpoint:
```java
@GetMapping("/hello")
public String hello() {
    return "Hello, World!";
}
```

**After changing:** 
1. Stop the app (Ctrl+C)
2. Run again: `mvn spring-boot:run`
3. Test: http://localhost:8080/hello

---

## 🎓 What You Learned

✅ **Spring Boot structure** - How a Spring Boot project is organized  
✅ **@SpringBootApplication** - Entry point annotation  
✅ **@RestController** - How to create REST APIs  
✅ **@GetMapping** - How to handle HTTP GET requests  
✅ **Maven** - How to run the application  
✅ **Testing** - How to verify endpoints work

---

## 🎯 Interview Questions You Can Now Answer

**Q: What is Spring Boot?**
> "Spring Boot is a framework that simplifies building Java applications. It provides auto-configuration, embedded servers, and production-ready features out of the box."

**Q: Explain @SpringBootApplication**
> "It's a convenience annotation combining @Configuration, @EnableAutoConfiguration, and @ComponentScan. It bootstraps the Spring application and scans for components."

**Q: What's the difference between @Controller and @RestController?**
> "@Controller is for MVC applications returning views. @RestController is for REST APIs returning data. @RestController = @Controller + @ResponseBody."

**Q: What HTTP method would you use to retrieve data?**
> "GET. It's safe and idempotent - doesn't modify server state."

---

## 🚦 Next Steps

Once you understand this step completely:

**✅ You can:**
- Create a Spring Boot application from scratch
- Add REST endpoints
- Run and test your application
- Explain basic Spring Boot concepts

**📚 Next (Step 2):**
- Add a database (PostgreSQL)
- Create your first Entity (User)
- Learn JPA annotations
- Save data to database

---

## 🐛 Troubleshooting

### "Port 8080 already in use"
```bash
# Find what's using port 8080
lsof -i :8080

# Kill it or change port in application.yml:
server:
  port: 8081
```

### "mvn: command not found"
Install Maven:
```bash
# macOS
brew install maven

# Ubuntu
sudo apt-get install maven

# Verify
mvn -version
```

### "java: invalid target release: 17"
Make sure Java 17 is installed:
```bash
java -version
# Should show version 17 or higher
```

---

## 💡 Pro Tips

1. **Read the code comments** - Every line is explained
2. **Experiment** - Change things and see what happens
3. **Use browser** - Easiest way to test GET endpoints
4. **Console output** - Watch what Spring Boot does on startup

---

**Congratulations! You've built your first Spring Boot application! 🎉**

Take your time to understand everything here before moving to Step 2.
