package com.te.threadassignment;

public class Users extends Thread{
	Printer printer;
	int pages;
	
	public Users(Printer printer, int pages) {
		super();
		this.printer = printer;
		this.pages = pages;
	}

	@Override
	public void run() {
		printer.print(pages);
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		Users user = new Users(printer, 100);
		Users user1 = new Users(printer, 10);
		user.start();
		user1.start();
	}
}
