package com.te.threadclass;

public class Main {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		currentThread.setPriority(10);
		Demo demo = new Demo();
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Ajay");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(currentThread.getPriority());
		
			
		demo.start();
	
		for(int i = 11;i<20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
