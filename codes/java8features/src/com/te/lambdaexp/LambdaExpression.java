package com.te.lambdaexp;

import java.util.Comparator;

public class LambdaExpression {

	public void print() {
		System.out.println("From print");
	}

	public int sum(int i, int j) {
		return i+j;
	}
	public static void main(String[] args) {
		
		FunctionalIntr x = new LambdaExpression()::sum;
		
		int add = x.add(10,20);
		
		
		System.out.println(add);
		// Anonymus class
//		FunctionalIntr intr = new FunctionalIntr() {
//			@Override
//			public void message() {
//				System.out.println("Hello");
//			}
//		};
//
//		intr.message();
//		System.out.println("=======================");
//
//		// Lambda Expression
//		FunctionalIntr functionalIntr = () -> {
//			System.out.println("Hello By lambda");
//		};
//		functionalIntr.message();
//		System.out.println("======================");
//
//		//Method Refrence
//		
//		FunctionalIntr fn = new LambdaExpression()::print;
//		fn.message();
		
		System.out.println("======================");
		
		// Lambda Expression with parameters
//		ParameterisedIntr intr2= (x,y)->{
//			return x+y;
//		};
		
//		int add = intr2.add(10, 20);
//		System.out.println(add);
		
		
	}
}
