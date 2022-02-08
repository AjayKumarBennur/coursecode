package com.technoelevate.inheritance.doubt;

public class MainClass {
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent.x);
		System.out.println(parent.y);
		parent.add();
		Child child = new Child();
		System.out.println(child.x);
		System.out.println(child.y);
		child.add();
	}
}
