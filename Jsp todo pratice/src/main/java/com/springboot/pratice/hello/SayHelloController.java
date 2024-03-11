package com.springboot.pratice.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning!!";
	}
	

	@RequestMapping("/say-hello-html")
	@ResponseBody
	public StringBuffer sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first html page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>this is body.</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb;	
	}
	
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
