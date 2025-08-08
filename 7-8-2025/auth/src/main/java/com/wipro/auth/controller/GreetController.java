package com.wipro.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetController {
	
	@GetMapping("/greet")
	String greet() {
		return "Hello from Greet";
	}
	
	@GetMapping("/hello")
	String hello() {
		return"Hello !!!";
	}
	
	@GetMapping("/welcome")
	String welcome() {
		return "Welcome ...";
	}

}
