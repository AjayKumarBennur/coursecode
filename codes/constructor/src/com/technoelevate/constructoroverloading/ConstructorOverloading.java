package com.technoelevate.constructoroverloading;

public class ConstructorOverloading {
	int id;
	String name;
	
	int count;
	
	{
		System.out.println("Welcome Employee");	
		count++;
	}
	
	
	public ConstructorOverloading() {
		
	}
	public ConstructorOverloading(int employeeId, String name) {
		this.id = employeeId;
		this.name = name;
	}
	
	void details() {
		System.out.println("EmployeeId :"+id+", Employee Name :"+name);
	}
}
