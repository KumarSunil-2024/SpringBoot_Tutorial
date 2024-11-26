package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.service.UserService;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service=context.getBean(UserService.class);
		service.report();
	}

}
