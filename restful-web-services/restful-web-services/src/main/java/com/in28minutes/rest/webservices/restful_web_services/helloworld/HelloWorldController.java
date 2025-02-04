package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
      
	  @GetMapping(path = "hello-world")
	  public String helloworld()
	  {
		  return "Hello World";
	  }
      
      @GetMapping(path = "/hello-world-bean")
	  public helloworldBean helloworldBean()
	  {
		  return new helloworldBean ("Hello World");
	  }
      @GetMapping(path = "/hello-world/path-variable/{name}")
	  public helloworldBean helloworldPathVariable(@PathVariable String name)
	  {
		  return new helloworldBean(String.format("Hello World,%s", name));
	  }
	   
}
