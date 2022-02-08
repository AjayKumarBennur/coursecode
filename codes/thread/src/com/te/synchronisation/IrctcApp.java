package com.te.synchronisation;

public class IrctcApp {
	public static void main(String[] args) {
		TrainTickets trainTickets = new TrainTickets();
		Users user = new Users(trainTickets, 10,"Ajay");
		Users user3 = new Users(trainTickets, 5,"Bennur");
		user.start();
		user3.start();

		TrainTickets trainTickets2 = new TrainTickets();
		Users user4 = new Users(trainTickets2, 15,"Akshay");
		Users user5 = new Users(trainTickets2, 3,"Siddu");
		
		user4.start();
		user5.start();
		
		
		
	}
}
