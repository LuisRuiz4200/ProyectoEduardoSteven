package com.web.eduardosteven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EduardostevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduardostevenApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		try {
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "index.html";
	}
}
