package com.te.supercallingstmt;

public class Child extends Parent{
	int x;
	int y;
	public Child(int x, int y) {
		super(x,y);
		System.out.println(super.x);
		this.x=10;
		this.y = 20;
	}
}
