package com.te.arraylistimpl;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
