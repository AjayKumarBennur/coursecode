package com.te.operators;

public class BitwiseOperator {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		//Bitwise and
		// 0010 & 0100 = 0000
		System.out.println(x&y);
		
		//Bitwise or
		//0010 | 0100 = 0110
		System.out.println(x|y);
		
		//Bitwise xor
		//0010 ^ 0100 = 
		System.out.println(x^y);
	}
}
