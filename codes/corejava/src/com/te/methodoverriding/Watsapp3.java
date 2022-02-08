package com.te.methodoverriding;

public class Watsapp3 extends Watsapp2{
	@Override
	public void message() {
		super.message();
		System.out.println("Message seen and has blue double tick");
	}
	
	public static void dance() {
		System.out.println("DAncing in watsapp 3");
	}
	
	public static void main(String[] args) {
		System.out.println("I am from watsapp class");
	}
}
