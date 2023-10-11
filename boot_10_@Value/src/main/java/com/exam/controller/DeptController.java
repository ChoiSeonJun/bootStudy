package com.exam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {
	
	// application.properties에 값을 가져오기
	@Value("${server.port}")
	String port;
	
	@Value("${xxx}")
	String xxx;
	
	// http://localhost:8090/main
	@GetMapping("/main")
	public String main() {
		System.out.println("DeptController " + port + xxx);
		return "hello"; // /WEB-INF/views/hello.jsp
	}

}
