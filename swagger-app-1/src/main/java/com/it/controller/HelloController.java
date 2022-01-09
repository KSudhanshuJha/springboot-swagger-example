package com.it.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.Hello;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class HelloController {
	
	@ApiOperation(value = "getGreeting", nickname = "getGreeting")
	 @ApiResponses(value = {
		        @ApiResponse(code = 500, message = "Server error"),
		        @ApiResponse(code = 404, message = "Service not found"),
		        @ApiResponse(code = 200, message = "Successful retrieval",
		            response = Hello.class, responseContainer = "List") })
	@GetMapping(value = "/api/javainuse")
	public List<Hello> sayHello(@ApiParam(value = "testId",
	        required = true, defaultValue = "111")  @PathVariable("id") final int institutuionId) {
		return null;
	}

}
