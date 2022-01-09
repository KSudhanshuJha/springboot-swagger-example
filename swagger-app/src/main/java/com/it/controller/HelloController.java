package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}

}
