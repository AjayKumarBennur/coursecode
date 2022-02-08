package com.technoelevate.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamImpl {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(101, "Ajay", 10000, 18,"Developer"),
				new Employee(102, "Bennur", 24000, 20,"HR"),
				new Employee(109, "Kumar", 20100, 24, "Developer"),
				new Employee(104, "Manju", 35000, 16, "Tester"),
				new Employee(103, "Siddu", 200000, 39, "MD"));
//		
//		Function<Employee, Boolean> fn =(emp)->{
//			emp.getAge();
//		};
	}
}
