package com.te.arraylistimpl;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(2);
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add(40);
		myArrayList.add(50);
		myArrayList.add(60);
		myArrayList.remove(2);
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList);
		Iterator iterator = myArrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
