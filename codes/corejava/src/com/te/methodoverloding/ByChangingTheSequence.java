package com.te.methodoverloding;

public class ByChangingTheSequence {
	public double add(int x, double y) {
		return x+y;
	}
	public double add(double x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		ByChangingTheSequence obj = new ByChangingTheSequence();
		System.out.println(obj.add(10.1, 10));
	}
}
