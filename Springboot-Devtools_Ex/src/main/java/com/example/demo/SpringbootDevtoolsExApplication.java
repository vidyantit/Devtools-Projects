package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDevtoolsExApplication {
 
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Devtools";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevtoolsExApplication.class, args);
	}

}
