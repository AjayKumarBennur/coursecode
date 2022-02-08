package com.te.waitandnotify;

public class Test {
	public static void main(String[] args) {
		GoDown goDown = new GoDown(100);
		Customer customer = new Customer(goDown, 75);
		Customer customer2 = new Customer(goDown, 150);
		Manufacture manufacture = new Manufacture(goDown, 200);
		
		customer.start();
		customer2.start();
		manufacture.start();
		
	}
}
