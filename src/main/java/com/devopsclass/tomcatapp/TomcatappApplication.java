package com.devopsclass.tomcatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController

@SpringBootApplication
public class TomcatappApplication {
	@RequestMapping("/")
	String basicURL() {
		return "Welcome to Spring Boot Hello World Tutorial";
	}
 
	@RequestMapping("crunchify")
	String crunchifyURL() {
		return "Hello Crunchify Friends! This is your first SpringBoot Example. Isn't that so Simple?";
	}
 
	public static void main(String[] args) {
		SpringApplication.run(TomcatappApplication.class, args);
	}

}
