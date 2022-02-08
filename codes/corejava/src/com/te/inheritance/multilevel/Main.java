package com.te.inheritance.multilevel;

public class Main {
	public static void main(String[] args) {
		Laptop t = new Test3();
		Test2 t2 = (Test2)t;
		t2.test();
		t2.dance();
	}
}
