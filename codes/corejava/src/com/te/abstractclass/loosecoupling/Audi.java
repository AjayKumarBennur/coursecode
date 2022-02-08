package com.te.abstractclass.loosecoupling;

public class Audi extends Car {

	@Override
	public void start() {
		System.out.println("Audi has been started");
	}

	@Override
	public void accelarate() {
		System.out.println("Audi is running");
	}

	@Override
	public void brake() {
		System.out.println("Audi has stopped");
	}
	
}
