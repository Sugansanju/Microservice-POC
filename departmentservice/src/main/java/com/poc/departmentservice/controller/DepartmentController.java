package com.poc.departmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@GetMapping("/home")
	public String name() {
		return "Hello from Department Service";
	}
}
