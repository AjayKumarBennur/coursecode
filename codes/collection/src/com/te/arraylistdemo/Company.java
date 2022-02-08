 package com.te.arraylistdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class Company {
	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<Employee>();
		Employee employee = new Employee(1, "Ajay");
		Employee employee4 = new Employee(5, "AjayKumar");
		Employee employee2 = new Employee(2, "Kumar");
		Employee employee3 = new Employee(3, "Bennur");
		
		employeesList.add(employee);
   		employeesList.add(employee2);
   		employeesList.add(employee4);
		employeesList.add(employee3);
		employeesList.add(employee3);
		
		//System.out.println(employeesList);
		for(Employee e : employeesList) {
			System.out.println(e);
		}
		System.out.println("==========printing with the list Iterator ===========");
		ListIterator<Employee> listIterator = employeesList.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("===============");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("========");
		
		Collections.sort(employeesList);
		for(Employee e : employeesList) {
			System.out.println(e);
		}
		
		
	}
}
