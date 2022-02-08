package com.technoelevate.inheritance;

public class Phone {
	double price;
	int simSlot;
	
	public Phone(double price, int simSlot) {
		super();
		this.price = price;
		this.simSlot = simSlot;
	}
	
	public void call() {
		System.out.println("Calling ......");
	}
	
	public void playRadio() {
		System.out.println("Playing Song From Radio ... Chamak Chalo..");
	}
	
	
}
