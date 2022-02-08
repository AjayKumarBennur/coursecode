package com.te.synchronisation;

public class TrainTickets {
	static int tickets = 20;

	public void bookTickets(int ticketsToBook, String name) {

		System.out.println("Hello : " + name);
		System.out.println("Welcome : " + name);

		synchronized (this) {
			if (ticketsToBook < tickets) {
				System.out.println(ticketsToBook + " Seats booked by : " + name);
				tickets -= ticketsToBook;
				System.out.println("Number of seats left : " + tickets);
				System.out.println("===========================");
			} else {
				System.out.println(name + " Tickets not booked");
				System.out.println(" Number of seats left : " + tickets);
				System.out.println("===========================");
			}
		}

		System.out.println("Thanks for visiting to our app");

	}
}
