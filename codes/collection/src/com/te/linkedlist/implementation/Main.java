package com.te.linkedlist.implementation;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insert(2);
		myLinkedList.insert(10);
		myLinkedList.insert(112);
		myLinkedList.insert(26);
		myLinkedList.insert(35);
		myLinkedList.insert(45);
		
		System.out.println(myLinkedList);
		
		Iterator iterator = myLinkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
