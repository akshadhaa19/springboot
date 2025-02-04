package com.in28minutes.springboot.myfirst_webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "hello what are you learning?";
		
	}
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
     	sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first html page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Html page with body");
        sb.append("</body>");
        sb.append("</html>");
        
        return sb.toString();

 }
	
	// "say-hello-jsp" = sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "Hello JSP";
		
}
}
