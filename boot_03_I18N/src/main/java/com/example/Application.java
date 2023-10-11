package com.example;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		String mesg = ctx.getMessage("greeting", null, null, Locale.KOREA);
		System.out.println(mesg);
		
		String mesg2 = ctx.getMessage("greeting", null, null, Locale.US);
		System.out.println(mesg2);
		
		String mesg3 = ctx.getMessage("greeting", null, null, Locale.CHINA);
		System.out.println(mesg3);
	}

}
