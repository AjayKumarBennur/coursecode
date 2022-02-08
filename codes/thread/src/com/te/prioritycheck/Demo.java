package com.te.prioritycheck;

public class Demo extends Thread {

	@Override
	public void run() {
		for(int i =0; i<10;i++) {
			System.out.println(i);
//			if(i==3) {
//				throw new ArithmeticException();
//			}
		
		}
	}

}
