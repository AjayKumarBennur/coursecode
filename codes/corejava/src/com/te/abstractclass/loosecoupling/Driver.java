package com.te.abstractclass.loosecoupling;

public class Driver {
	public void drive(Car car) {
		car.start();
		car.accelarate();
		car.brake();
	}
}
