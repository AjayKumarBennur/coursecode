package com.te.springwithoutxml;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Meow Meow");
	}

	@Override
	public void eat() {
		System.out.println("Eats the rat");
	}

}
