package com.te.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
		
//		engine.start();
//		Car car = new Car();
//		car.move();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car car = context.getBean(Car.class);
		car.move();
	}
}
