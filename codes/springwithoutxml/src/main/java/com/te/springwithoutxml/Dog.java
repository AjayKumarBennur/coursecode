package com.te.springwithoutxml;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog is barking bow bow");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats pedigre");
	}

}
