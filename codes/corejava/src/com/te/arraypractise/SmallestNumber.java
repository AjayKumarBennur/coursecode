package com.te.arraypractise;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -1,30, 40, 2, 3, 7,1,0};
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}
}
