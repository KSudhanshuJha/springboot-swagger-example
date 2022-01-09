package com.it.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.it"})
public class SwaggerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerAppApplication.class, args);
	}

}
