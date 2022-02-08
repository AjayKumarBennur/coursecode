package com.te.interthreadcommunication;

public class App {
	public static void main(String[] args) {
		Flipkart flipkart = new Flipkart();
		Consumer consumer = new Consumer(flipkart, 12);
		Consumer consumer2 = new Consumer(flipkart, 10);
		Consumer consumer3 = new Consumer(flipkart, 10);
		
		Supplier supplier = new Supplier(flipkart, 20);
		
		consumer.start();
		consumer2.start();
		consumer3.start();
		
		supplier.start();
		
	}
}
