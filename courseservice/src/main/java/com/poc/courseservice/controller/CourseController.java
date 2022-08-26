package com.poc.courseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CourseController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "fallback")
	
	@GetMapping("/home")
	public String name() {
		System.out.println("=-----------Call Course Service-------------");
		String quote=restTemplate.getForObject("http://userservice/user_home", String.class);
		return quote;
	}

	public String fallback() {
		return "UserService gateway is down";
	}
}
