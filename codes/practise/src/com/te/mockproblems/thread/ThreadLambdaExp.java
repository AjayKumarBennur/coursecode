package com.te.mockproblems.thread;

import com.sun.tools.javac.Main;

public class ThreadLambdaExp {
	
	@Override
	protected void finalize() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Runnable run = ()->{
			for(int i = 1; i<10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(run);
		thread.start();
		System.out.println(Main.class.getName());
		System.out.println(thread.getName());
		
		//Anonymus Class
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for (int i=11; i<20;i++) {
					System.out.println(i);
				}
			}
		};
		ThreadLambdaExp threadLambdaExp = new ThreadLambdaExp();
		thread1.start();
		System.out.println(thread1.getName());
		System.gc();
		
	}
}
