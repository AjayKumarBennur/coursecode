package com.te.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		ScopeDemo bean = container.getBean(ScopeDemo.class);
		System.out.println(bean);
		ScopeDemo bean2 = container.getBean(ScopeDemo.class);
		System.out.println(bean2);
	}
}
