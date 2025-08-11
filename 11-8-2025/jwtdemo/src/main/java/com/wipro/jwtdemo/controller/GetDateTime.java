package com.wipro.jwtdemo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDateTime {
	
	@GetMapping("getcurrentdate")
	public LocalDate getDate() {
		return LocalDate.now();
	}

}
