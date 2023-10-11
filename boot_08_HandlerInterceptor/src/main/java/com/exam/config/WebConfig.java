package com.exam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.exam.interceptor.MyHandlerInterceptor;

@Configuration // servlet-context.xml 역할
public class WebConfig implements WebMvcConfigurer {
	
	/*
	   <mvc:interceptors>
		 <mvc:interceptor>
		   <mvc:mapping path="/loginCheck/*"/>
		    <ref bean="xxx"/>
		 </mvc:interceptor>
	*/
	
	@Autowired
	MyHandlerInterceptor interceptor;
	
	//
	@Override // login, mypage 호출할경우 인터셉터 실행
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor).addPathPatterns("/login", "/mypage"); //interceptor == <ref bean="xxx"> 의 xxx 
	}

	
	/* 바로 뷰 호출
	  <mvc:view-controller path="/mypage" view-name="main"/>
	*/
	// mypage를 호출하면 main으로 가라. (바로 뷰 호출할 때, 이처럼 컨트롤러 생략 가능)
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/mypage").setViewName("main");
	}
}
