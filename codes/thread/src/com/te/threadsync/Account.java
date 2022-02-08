package com.te.threadsync;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("Insufficient balance");
		}else{
			balance -=amount;
			System.out.println("The amount withdrawn is : "+amount+" Balance left : "+balance);
		}
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance is :"+balance);
	}
}
