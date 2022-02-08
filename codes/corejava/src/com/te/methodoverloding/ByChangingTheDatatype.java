package com.te.methodoverloding;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ByChangingTheDatatype {
	public int add(int x , int y) {
		return x+y;
	}
	
	public double add(double x,double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		ByChangingTheDatatype test = new ByChangingTheDatatype();
		double result = test.add(12.3, 14.2);
		System.out.println(Math.round(result));
		System.out.println(result);
	}
}
