package com.te.interthreadcommunication;

public class Consumer extends Thread {

	Flipkart flipkart;
	int noOfProducts;

	public Consumer(Flipkart flipkart, int noOfProducts) {
		super();
		this.flipkart = flipkart;
		this.noOfProducts = noOfProducts;
	}

	@Override
	public void run() {
		flipkart.purchase(noOfProducts);
	}
}
