package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.DeptServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		DeptServiceImpl service = ctx.getBean("xxx", DeptServiceImpl.class);
		List<String> list = service.list();
		System.out.println("SpringApplication 실행");
	}

}
