package com.te.exception.throwdemo;

public class Licsence {
	String name;
	int age;
	
	public Licsence(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void validate() throws LicsenceException {
		if(age>18) {
			System.out.println("Under Process");
		}else {
			throw new LicsenceException("Not yet elgible");
		}
	}
	
	public void generate() {
		System.out.println("Generated successful");
	}
}
