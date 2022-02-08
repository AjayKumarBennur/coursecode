package com.te.synchronisation;

public class Users extends Thread {
	TrainTickets trainTickets;
	int seats;
	String name;

	public Users(TrainTickets trainTickets, int seats, String name) {
		super();
		this.trainTickets = trainTickets;
		this.seats = seats;
		this.name = name;
	}

	@Override
	public void run() {
		trainTickets.bookTickets(seats,name);
	}
}
