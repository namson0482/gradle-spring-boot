package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		System.out.println("Welcome to TripAdvisor!!!");
		return "Vu Nam Son Greetings from Spring Boot!";
	}

}
