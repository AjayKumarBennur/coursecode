package com.te.methodoverriding;

public class User extends Watsapp3{
	
	public static void main(String[] args) {
//		Watsapp3 watsapp3 = new Watsapp3();
//		watsapp3.message();
//		
//	 Watsapp2 watsapp2 = new Watsapp2();
//	 watsapp2.message();
//	 
	 Parent p = new Watsapp2();
	 p.message();
	 p.sing();
	}
}
