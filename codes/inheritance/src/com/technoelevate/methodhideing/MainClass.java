package com.technoelevate.methodhideing;

public class MainClass {
	public static void main(String[] args) {
		Child child = new Child();
		child.add();
		Parent parent = new Parent();
		parent.add();
		
		Parent upcast = new Child();
		upcast.add();
		Child child2 =(Child) upcast;
		child2.add();
	}
}
