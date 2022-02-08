package com.technoelevate.hashsetimpl;

public class MyMain {
	public static void main(String[] args) {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		linkedListImpl.insert(2);
		linkedListImpl.insert(10);
		linkedListImpl.insert(123);
		linkedListImpl.insert(1234);
		System.out.println(linkedListImpl);
	}
}
