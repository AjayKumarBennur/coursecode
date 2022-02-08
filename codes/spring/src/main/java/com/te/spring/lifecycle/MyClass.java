package com.te.spring.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("container.xml");
		Demo bean = con.getBean(Demo.class);
		bean.m1();
		con.close();
	}
}
