package com.te.stream;

public class Employee {
	int id;
	int age;
	String name;
	double salary;
	String desig;
	
	public Employee(int id, int age, String name, double salary, String desig) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + ", desig=" + desig
				+ "]";
	}
	
	
}