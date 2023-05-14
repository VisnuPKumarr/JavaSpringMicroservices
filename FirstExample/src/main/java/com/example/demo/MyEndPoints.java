package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints {

	@RequestMapping("/mypage")		
	public String myString(){
	 return "My First Microservice";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome : " + name;
	}
	
	@RequestMapping(path = "/secondpathvar/{name}")
	public String sayHello1(@PathVariable String name) {
		return "Path definition : " + name;
	}
	
	@GetMapping(path = "/secondSampleBean")
	public SecondSampleBean secondSampleBeanMethod() {
		return new SecondSampleBean("For Oracle India");
	}
}
