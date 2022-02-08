package com.te.abstractclass.loosecoupling;

public class Jaguar extends Car {

	@Override
	public void start() {
		System.out.println("Jaguar has started");
	}

	@Override
	public void accelarate() {
		System.out.println("Jaguar is running");
	}

	@Override
	public void brake() {
		System.out.println("Jaguar has stopped");
	}
	
}
