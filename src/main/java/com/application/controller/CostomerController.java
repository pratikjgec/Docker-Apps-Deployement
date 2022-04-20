package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CostomerController {

	@GetMapping("/")
	String up()
	{
		return "Application is up and running!!!";
	}
	@GetMapping("/home")
	String health()
	{
		return "Welcome to Application!!!";
	}
	
}
