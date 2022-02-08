package com.technoelevate.practise;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ajay");
		hashSet.add("siddu");
		Iterator<String> iterator = hashSet.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next().hashCode());
//		}
		hashSet.add("Ajay");
		while(iterator.hasNext()) {
			System.out.println("From below");
			System.out.println(iterator.next().hashCode());
		}
	}
	
	//109432287
//	2041409

}
//109432287
//2041409