package com.te.polymorphism;

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.i);
		demo.m1();

		Demo demo4 = new Demo();
		Demo demo2 = new Demo2();
		System.out.println(demo2.i);
		demo2.m1();
		Demo2 d = (Demo2) demo2;

		System.out.println(d.i);
		d.m1();
		
		
		Demo3 demo3 = new Demo3();
		System.out.println(demo3.i);
		demo3.m1();
		boolean b =demo2.equals(demo4);
		System.out.println(b);
	}
}
