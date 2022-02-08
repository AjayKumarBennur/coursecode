package com.te.interfacedemo;

public class Test implements Demo , Demo2{
	
	@Override
	public void greet() {
		System.out.println("Namaskar");
	}

	@Override
	public void message() {
		System.out.println("Hello and welcome Guys!!");
	}
	
}
