package com.product.in.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {

	@RequestMapping("/product")
	@GetMapping
	public String buyproduct() {
		
		return "new product ";
		
	}
}
