package com.te.polymophism.runtime;

public class Main {
	public static void assignWork(Employee emp) {
		emp.work();
	}
	public static void main(String[] args) {
		assignWork(new SoftwareDeveloper());
	}
}
