package com.te.treeset;

import java.util.TreeSet;

public class Demo{
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(90);
		treeSet.add(22);
		treeSet.add(22);
		for(Object i : treeSet) {
			System.out.println(i);
		}
	}
}
