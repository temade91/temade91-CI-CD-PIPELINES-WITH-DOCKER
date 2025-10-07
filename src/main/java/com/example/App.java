package com.example;

import jakarta.annotation.PostConstruct;   // ✅ use jakarta, not javax
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}
