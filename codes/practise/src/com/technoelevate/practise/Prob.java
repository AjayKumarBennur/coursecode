package com.technoelevate.practise;

import java.util.Arrays;

public class Prob {
	
	public static void main(String[] args) {
		
		int[] arr = {1 , 2 ,3, 4, 4 ,2, 3 };
		
		int[] a = Arrays.stream(arr).distinct().toArray();
		for(int x : a) {
			System.out.println(x);
		}
	}

}
