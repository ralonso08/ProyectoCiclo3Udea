package com.UdeaGrupo.Proyecto3;

import com.UdeaGrupo.Proyecto3.modelos.Empresa;
import jdk.swing.interop.SwingInterOpUtils;
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
		return "Hola Ciclo3 :)";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp = new Empresa("Solar Sas", "cra 116", "32156545", "9664564-1");
		emp.setNombre("SOLAR LTDA");
		System.out.println("Acá se modificó el nombre de la empresa");
		return emp.getNombre();
	}
	public static void main(String[] args) {
		SpringApplication.run(Proyecto3Application.class, args);

	}

}
