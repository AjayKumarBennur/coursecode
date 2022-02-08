package com.te.exception.runtime;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = scan.nextInt();
		System.out.println("Enter the second number");
		int y = scan.nextInt();
		int result = x/y;
		System.out.println(result);
		
	}
}
