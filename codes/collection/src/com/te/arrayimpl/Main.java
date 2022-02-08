package com.te.arrayimpl;

import java.util.Iterator;

import com.te.linkedlist.Bike;

public class Main {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(2);
		myArrayList.add("Ajay");
		myArrayList.add("Kumar");
		myArrayList.add("siddu");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.add("WWF");
		myArrayList.remove(2);
		//System.out.println(myArrayList.get(3));
		Iterator iterator = myArrayList.iterator();
		System.out.println(myArrayList);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
