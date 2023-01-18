package com.example.com.myrestproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value="/name")
	String mymethod() {
		return"mahesh";
	}
	
	
}
