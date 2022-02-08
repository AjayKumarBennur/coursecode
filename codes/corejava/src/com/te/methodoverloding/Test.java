package com.te.methodoverloding;

public class Test {
	public void sum (int x, long y) {
		System.out.println(x+y);
	}
	public void sum (long x, int y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
//		test.sum(12, 21);
	}
}
