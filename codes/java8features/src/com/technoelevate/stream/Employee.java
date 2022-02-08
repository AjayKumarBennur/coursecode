package com.technoelevate.stream;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	int age;
	String designation;

	public Employee(int employeeId, String employeeName, double salary, int age, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
		this.designation = designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + ", designation=" + designation + "]";
	}
	
	

}
