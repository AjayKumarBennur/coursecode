package com.te.abstractclass.loosecoupling;

public class Owner {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Jaguar());
	}
}
