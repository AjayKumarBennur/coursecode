package com.technoelevate.practise;

import java.util.ArrayList;

public class Recursion {
	
	/*
	 * A method calling itself is called is recursion. And the method is called as
	 * recursive method.
	 * It helps in reducing the line of code in the program.
	 */	
	ArrayList<String> ref = null;
	static String str = "";
	
	/**
	 * THis is a Test
	 * @param it tkas integer
	 * @return returns an integer
	 */
	public static int factorial(int n) {
		
		if (n<1) {
			return 1 ; 
		}else {
			return (n*factorial(n-1));
		}
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println(factorial(5));
		String[] s = str.split("");
		
	}
	
}
