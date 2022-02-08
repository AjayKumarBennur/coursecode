package com.te.spring.dependency;

public class Engine {

	String name;
	double capacity;

	public Engine(String name, double capacity) {
		System.out.println("Created");
		this.name = name;
		this.capacity = capacity;
	}

	public void start() {
		System.out.println("Engine has started");
	}
}
