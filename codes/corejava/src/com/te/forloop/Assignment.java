package com.te.forloop;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int sum = 0;
		for (int j = 0; j < n; j++) {
			sum = sum + (int) Math.pow(2, j) * b;
			System.out.print(sum + " ");

		}
	}
}
