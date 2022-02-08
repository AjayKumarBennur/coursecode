package com.technoelevate.practise;

public class ClassDoubt {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, Exception {
		System.out.println(ClassDoubt.class);
		System.out.println(Class.forName("com.technoelevate.practise.ClassDoubt"));
		System.out.println(ClassDoubt.class.newInstance());
	}
}

