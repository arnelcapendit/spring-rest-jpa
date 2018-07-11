package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method= RequestMethod.GET, value="/helloWorld")
	@GetMapping(value="/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping(path="/helloWorldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	
	@GetMapping(path="/helloWorldBean/{name}")
	public HelloWorldBean helloWorldBeanName(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World Bean %s", name));
	}
}
