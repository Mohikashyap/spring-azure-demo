package com.javafsd.azuremohini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureMohiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureMohiniApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Welcome to our Azure page" ;
	}
	

}
