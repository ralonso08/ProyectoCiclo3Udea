package com.UdeaGrupo.Proyecto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Proyecto3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo3";
	}
	public static void main(String[] args) {
		SpringApplication.run(Proyecto3Application.class, args);

	}

}
