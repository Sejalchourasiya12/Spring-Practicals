package com.rays.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rays.AppConfig;

public class TestUserService {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	     UserService userService = context.getBean(UserService.class);
	     UserServiceByConstructor userService1 = context.getBean(UserServiceByConstructor.class);
	     UserServiceByName userService2 = context.getBean(UserServiceByName.class);
	     UserServiceBySetter userService3 = context.getBean(UserServiceBySetter.class);
	     userService2.testAdd();
	     userService1.testAdd();
	}
	
	
}
