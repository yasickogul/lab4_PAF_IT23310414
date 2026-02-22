package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	@GetMapping("/greet")
    public String greet() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/greet/{name}")
    public String greetPerson(
            @PathVariable String name,
            @RequestParam(required = false) String message
    ) {

        if (message == null || message.trim().isEmpty()) {
            return "Hello " + name + "! Welcome to Spring Boot!";
        }

        return "Hello " + name + "! " + message;
    }


}
