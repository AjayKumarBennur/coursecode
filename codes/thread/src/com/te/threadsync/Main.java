package com.te.threadsync;

public class Main {
	public static void main(String[] args) throws Exception {
		Account account = new Account(10000);
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		husband.start();
		wife.start();
		husband.join();
		wife.join();
		account.checkBalance();
	}
}
