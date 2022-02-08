package com.te.polymophism.runtime;

public class SoftwareDeveloper implements Employee{

	@Override
	public void work() {
		System.out.println("I am Developing");
		SoftwareDeveloper.class.getName();
	}
	
		
}
