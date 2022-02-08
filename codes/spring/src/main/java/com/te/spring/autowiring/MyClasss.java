package com.te.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClasss {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Laptop bean = con.getBean(Laptop.class);
		bean.start();
	}
}
