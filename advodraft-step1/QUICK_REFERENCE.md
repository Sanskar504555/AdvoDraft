# ⚡ STEP 1 - Quick Reference Card

## 🎯 What We Built
A minimal Spring Boot app with 2 endpoints

## 📦 Files (Only 3!)
1. `AdvodraftApplication.java` - Entry point
2. `HelloController.java` - REST endpoints
3. `application.yml` - Configuration

## ▶️ Run It
```bash
cd advodraft-step1
mvn spring-boot:run
```

## 🌐 Test It
- http://localhost:8080/ → Welcome message
- http://localhost:8080/status → Status check

## 🔑 Key Concepts

### @SpringBootApplication
- Starts Spring Boot
- Scans for components
- Auto-configures everything

### @RestController
- Handles HTTP requests
- Returns data (JSON/text)

### @GetMapping("/path")
- Maps URL to method
- GET = retrieve data

## 💬 Interview Questions

**Q: What is @SpringBootApplication?**
✅ "Combines @Configuration, @EnableAutoConfiguration, @ComponentScan"

**Q: Difference between @Controller and @RestController?**
✅ "@RestController = @Controller + @ResponseBody. Returns data, not views."

**Q: What HTTP method retrieves data?**
✅ "GET - it's safe and idempotent"

## 🎯 You Can Now:
- ✅ Create Spring Boot app
- ✅ Add REST endpoints
- ✅ Run and test
- ✅ Explain basics

## ➡️ Next: Step 2
Add database, create User entity, save data

---

**Master this before moving on! 🚀**
