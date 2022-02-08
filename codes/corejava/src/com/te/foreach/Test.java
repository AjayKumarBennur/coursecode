package com.te.foreach;

public class Test {
	public static void main(String[] args) {
		int[] number = { 10, 20, 30 };

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		for (int i : number) {
			System.out.println(i);
		}
	}
}
