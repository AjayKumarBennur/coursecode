package com.te.threadsync;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			account.deposit(10);
		}
		System.out.println(Thread.currentThread().getName());

	}
}
