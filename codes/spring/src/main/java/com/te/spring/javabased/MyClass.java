package com.te.spring.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Parent bean = con.getBean(Parent.class);
		System.out.println(bean);
	}
}
