package com.te.waitandnotify;

public class GoDown {
	int products;

	public GoDown(int products) {
		super();
		this.products = products;
	}

	public synchronized void store(int noOfItems) {
		products += noOfItems;
		System.out.println("Item stored left products :" + products);
		notify();

	}

	public synchronized void purchase(int noOfItems) {
		if (noOfItems > products) {
			System.out.println("Out of stock!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		products -= noOfItems;
		System.out.println("Purchase Complete products left : " + products);
	}
}
