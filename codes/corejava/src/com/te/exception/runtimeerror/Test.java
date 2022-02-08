package com.te.exception.runtimeerror;

public class Test {
	public static void m1() {
		System.out.println(" in m1");
		m1();
	}
	public static void main(String[] args) {
		System.out.println("Program Started");
		m1();
	}
}
