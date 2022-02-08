package com.te.array;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -1,30, 40, 2, 3, 7,1,0};
		int temp=0;
		for(int i =0 ; i<arr.length;i++) {
			for (int j =0; j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
