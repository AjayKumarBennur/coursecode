package com.technoelevate.practise;

import java.util.LinkedList;
import java.util.List;

public class Test {
	int count = 10;
	static void add() {
		Test test = new Test();
		System.out.println(test.count);
	}
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Ajay");
		list.add("Kumar");
		System.out.println(list);
		System.out.println(list.get(3));
		
	}
}
