package com.te.varargs;

import java.util.Scanner;

public class Test {
	public int add(int... x) {
		int result=0;
		for(int i=0;i<x.length;i++) {
			result+=x[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.add(2,3,4,5,6,7,8,9));
	}
}
