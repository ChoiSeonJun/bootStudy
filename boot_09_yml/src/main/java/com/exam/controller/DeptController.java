package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {
	
	// http://localhost:8090/main
	@GetMapping("/main")
	public String main() {
		System.out.println("DeptController");
		return "hello"; // /WEB-INF/views/hello.jsp
	}

}
