package com.te.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
//		int[]  arr = new int [4];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//	//	arr[4]=50;
//		System.out.println(Arrays.toString(arr));
		List c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(50);
		c.add(30);
		c.add(40);
		c.add(50);
		Collection collection = new ArrayList();
		collection.add("Ajay");
		collection.add("Kumar");
		c.addAll(collection);
		c.removeAll(collection);
		collection.clear();
		System.out.println(collection.isEmpty());
		c.add(1);
		Collections.sort(c);
		System.out.println(c);
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
}
