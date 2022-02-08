package com.te.hashset.student;

import java.util.Objects;

public class Student{
	
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return rollNo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		if(this.rollNo==student.rollNo)
			return true;
		return false;
			
	}
	
	
}
