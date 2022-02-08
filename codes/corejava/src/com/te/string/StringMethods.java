package com.te.string;

public class StringMethods {
	public static void main(String[] args) {
		String s = "         I am Ajay";
		System.out.println(s);
//		System.out.println(s.hashCode());
//		s=s.concat(s);
//		System.out.println(s);
//		System.out.println(s.hashCode());
//		System.out.println("==================");
//		String s1 = new String("Kumar");
//		System.out.println(s1.hashCode());
//		s1=s1.toUpperCase();
//		System.out.println(s1.hashCode());
//		System.out.println("================");
//		StringBuilder str = new StringBuilder("Bennur");
//		System.out.println(str.hashCode());
//		str.append("Boss");
//		System.out.println(str.hashCode());

//		String[] s1 = s.split(" ", 4);
//		for (String x : s1) {
//			System.out.println(x);
//		}
		
		String trim = s.trim();
		System.out.println(trim);
		// ============================
		Integer i = 10;
		int j = i.intValue();// unboxing
		int k = i;// auto unboxing

		int x = 20;
		Integer y = Integer.valueOf(x);// boxing
		Integer z = x;// boxing
		System.out.println(j);

	}
}
