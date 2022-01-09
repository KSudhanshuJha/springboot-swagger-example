package com.it.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Hello {

	private int helloId;
	private String test;

	@ApiModelProperty(position = 1, required = true, value = "1")
	public int getHelloId() {
		return helloId;
	}

	public void setHelloId(int helloId) {
		this.helloId = helloId;
	}

	@ApiModelProperty(position = 2, required = true, value = "helloTest")
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
