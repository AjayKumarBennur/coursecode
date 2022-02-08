package com.te.spring.dependency;

public class Car {
	String name;

	Engine en;

	public Car() {
	}
	
	public Car(Engine en) {
		this.en = en;
	}

	

	public void setEn(Engine en) {
		this.en = en;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		en.start();
		System.out.println(name + " Car has started and has " + en.name + " engine and has capacity " + " of "
				+ en.capacity);
	}
}
