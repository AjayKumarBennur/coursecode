package com.te.specifiers;

public class Methods {
	
	protected int x=10;
	public void m1() {
		System.out.println("m1 is public");
	}
	
	protected void m2() {
		System.out.println("m2 is protected");
	}
	
	void m3() {
		System.out.println("m3 is default");
	}
	
	private void m4() {
		System.out.println("m4 is private");
	}
	
	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.m1();
		methods.m2();
		methods.m3();
		methods.m4();
	}
}
