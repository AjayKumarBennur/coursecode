package com.te.supercallingstmt;

public class SuperCallingStmt {
	public static void main(String[] args) {
		Child child = new Child(1, 2);
		System.out.println(child.x);
	}
}
