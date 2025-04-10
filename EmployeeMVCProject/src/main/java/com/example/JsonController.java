package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class JsonController {
	@RequestMapping("/api")
	public String jsonFormat() {
		return "Chaitanya";
	}
	
	@RequestMapping("/Object")
	public Employee jsonFormatObject() {
		return new Employee(10,"Chaitanya","CS",60000);
	}
    
}
