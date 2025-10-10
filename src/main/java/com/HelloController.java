package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot in Docker!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running fine!";
    }
}
