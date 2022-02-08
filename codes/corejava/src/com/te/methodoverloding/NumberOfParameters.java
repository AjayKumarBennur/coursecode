package com.te.methodoverloding;

public class NumberOfParameters {
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int x, int y,int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
	NumberOfParameters obj = new NumberOfParameters();
	System.out.println(obj.add(12, 22, 33));
	}
}
