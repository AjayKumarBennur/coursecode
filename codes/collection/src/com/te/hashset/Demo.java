package com.te.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(40);
		hashSet.add(40);
		hashSet.add(20);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(15);
		hashSet.add(null);
		
		List list = new ArrayList(hashSet);
		Collections.sort(list);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
