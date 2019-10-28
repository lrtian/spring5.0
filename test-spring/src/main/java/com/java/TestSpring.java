package com.java;

import com.java.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.java.service.HelloService;

public class TestSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = (HelloService) app.getBean("helloService");
		helloService.hello();
	}
}
