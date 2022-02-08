package com.te.exception.runtime;

public class SingleTryandMultipleCatch {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 5;
			int k = x / y;
			int[] arr = new int[k];
			arr[4] = 50;
			return;
			//System.out.println("The value is :" + arr[4]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("arithmetic");
			}
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("arrays");
			 }

		}
	}
}
