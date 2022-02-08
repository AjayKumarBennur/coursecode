package com.te.interthreadcommunication;

public class Supplier extends Thread {
	Flipkart flipkart;
	int noOfProducts;

	public Supplier(Flipkart flipkart, int noOfProducts) {
		super();
		this.flipkart = flipkart;
		this.noOfProducts = noOfProducts;
	}

	@Override
	public void run() {
		flipkart.stockRefill(noOfProducts);
	}
}
