package com.te.casting;

public class Widening {
	public static void main(String[] args) {
		short s = 12;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		
		char x = 97;
		System.out.println(x);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
	}
}
