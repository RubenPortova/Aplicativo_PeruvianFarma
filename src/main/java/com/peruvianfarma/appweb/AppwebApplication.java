package com.peruvianfarma.appweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppwebApplication {



@GetMapping(value="/hello")
public String getMethodName(){
	return "administrador/admindex.html";
}


	public static void main(String[] args) {
		SpringApplication.run(AppwebApplication.class, args);
	}

}