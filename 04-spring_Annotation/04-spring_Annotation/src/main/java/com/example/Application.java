package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contect=new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
