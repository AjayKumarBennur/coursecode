package com.te.interthreadcommunication;

public class Flipkart {
	int products = 20;

	public synchronized void purchase(int noOfProducts) {
		if (products < noOfProducts) {
			System.out.println("Out of Stock!!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
			System.out.println("Your Order Accepted, No of products ordered : " + noOfProducts);
			products -= noOfProducts;
			System.out.println("Thanks For ordering");
			System.out.println("Number of products are : " + products);
			System.out.println("==========");
			
		
	}

	public synchronized void stockRefill(int noOfProducts) {
		products += noOfProducts;
		System.out.println("Products restocked !");
		System.out.println("Number of products are : " + products);
		System.out.println("==========");
		notify();
	}

}
