package com.te.operators;

public class BasicOperators {
	public static void main(String[] args) {
		int x = 2;
		int y =-4;
		
		// Unary Operator
		System.out.println(~x);
		System.out.println(~y);
		System.out.println(!false);
		
		//Arithmetic Operator
		System.out.println(x+y);		
		System.out.println(x-y);		
		System.out.println(x%y);		
		System.out.println(x/y);		
		
		//Bitwise Operator
		System.out.println(2|4);
		System.out.println("-----");
		
		//Shift Operator
		System.out.println(10<<1);
		
		//Relational Operator
		System.out.println("============");
		System.out.println(x<=y);
		System.out.println(x<y);
		
		//Logical Operator
		System.out.println(y>x && 4>3);
		
		//ternary operator
		System.out.println((x>y)?x:y);
		
		
		
	}
}
