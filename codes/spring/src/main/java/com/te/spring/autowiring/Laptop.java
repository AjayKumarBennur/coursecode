package com.te.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	Battery  b;
	
	Laptop(){}
	
	public Laptop(Battery b) {
		this.b = b;
	}

	public void setB(Battery bat) {
		System.out.println("from setter");
		this.b = bat;
	}
	
	public void start() {
		System.out.println("Laptop has started and has "+b.name+" in it.");
	}
	
}
