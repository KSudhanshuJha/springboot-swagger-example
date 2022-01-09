package com.it.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.it"})
public class SwaggerApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApp1Application.class, args);
	}

}
