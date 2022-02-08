package com.te.waitandnotify;

public class Customer extends Thread {
	GoDown goDown;
	int items;
	public Customer(GoDown goDown, int items) {
		super();
		this.goDown = goDown;
		this.items = items;
	}
	
	
	public void run() {
		goDown.purchase(items);
	}
}
