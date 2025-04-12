package com.example.RSSpringBoot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/api")  
public class SpringController {

    @GetMapping("/hello")  
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/greet")  
    public String greet() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/welcome")  
    public String welcome() {
        return "Welcome to Spring Boot Application!";
    }
}
