package com.te.decisionstmt;

import java.util.Scanner;

public class IfElseStmt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age");
		int age = scanner.nextInt();
		if (age>=28) {
			if (age<33) {
				System.out.println("Search for a bride");
			}
			else {
				System.out.println("Waste Fellow");
			}
		}
		else {
			System.out.println("Concentrate on your carrer");
		}
	}
}
