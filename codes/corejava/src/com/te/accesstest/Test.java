package com.te.accesstest;

import com.te.specifiers.Methods;

public class Test extends Methods {
	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.m1();
		Test t = new Test();
		System.out.println(t.x);
		t.m2();
		//methods.m3();
		//methods.m4();
	
	}
}
