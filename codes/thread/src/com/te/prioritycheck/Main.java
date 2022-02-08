package com.te.prioritycheck;

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		Demo2 demo2 = new Demo2();
		demo.setPriority(1);
		demo2.setPriority(10);
		demo.start();
		demo2.start();
	}
}
