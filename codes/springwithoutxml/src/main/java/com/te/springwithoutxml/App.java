package com.te.springwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Pet.class);
		Pet pet =(Pet) container.getBean("pet");
		pet.comeHere();
	}
}
