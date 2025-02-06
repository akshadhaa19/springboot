package com.demo.ProjectApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@RequestMapping("/")
	public String greet() {
		return "hello world";
	}

}
