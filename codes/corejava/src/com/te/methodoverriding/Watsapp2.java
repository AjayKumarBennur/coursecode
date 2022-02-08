package com.te.methodoverriding;

public class Watsapp2 extends Parent{
	@Override
	public void message() {
		super.message();
		System.out.println("message with double tick");
	}
	
	public void sing() {
		System.out.println("SInging");
	}
	
	public static void dance() {
		System.out.println("Dancing");
	}
}
