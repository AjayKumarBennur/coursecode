package com.te.threadassignment;

public class Printer{
	public synchronized void print(int pages) {
		for (int i = 0; i < pages; i++) {
			System.out.println(": printing page number : "+i+" of "+Thread.currentThread().getName());
		}
	}
}
