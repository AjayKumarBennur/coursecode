package com.te.arraylistdemo;

public class Employee implements Comparable<Employee>{
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		if (id > 0) {
			this.id = id;
		}
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return emp.id-this.id;
	}
}
