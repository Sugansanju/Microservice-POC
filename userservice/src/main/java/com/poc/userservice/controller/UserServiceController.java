package com.poc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserServiceController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String name() {
		String quote=restTemplate.getForObject("http://departmentservice/home", String.class);
		return quote;
	}
	
	@GetMapping("/user_home")
	public String userHome() {
		return "This is UserService";
	}
	
	@GetMapping("/admin")
	public String alert() {

		return " This is admin URL";
	}
}
