package com.technoelevate.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(101, "Ajay", 10000, 18,"Developer"),
											new Employee(102, "Bennur", 24000, 20,"HR"),
											new Employee(109, "Kumar", 20100, 24, "Developer"),
											new Employee(104, "Manju", 35000, 16, "Tester"),
											new Employee(103, "Siddu", 200000, 39, "MD"));
		
		Employee emp = list.get(0);
		for(int i =0 ; i<list.size();i++) {
			if (emp.age>list.get(i).age) {
				emp = list.get(i);
			}
		}
		
		
		Comparator<Employee> com =(e1,e2)->{
			return e1.getAge()-e2.getAge();
		};
		
//		Function<Employee, > fn =(em)->{
//			return com;
//		};
//				
//		Comparator.comparing(fn);
				
				System.out.println(emp);
		System.out.println("=============================");
		/* min accepts the comparator type objects (Comparator is functional interface)
		 * comparing is method which takes in the functional type of object as input 
		 * functional interface has only one abstract method that is accept and it accepts any kind of object 
		 * so we are passing the employee type of object and we using the method reference to refer the comparing the list w.r.t age 
			*/		
		
		
		// min value
		Optional<Employee> min = list.stream().min(Comparator.comparing(Employee::getAge));
		System.out.println(min);
		System.out.println("=============================");
		
		
		// max value
		list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
		
		System.out.println("=============================");
		//custom sorting
		list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("=============================");
		
		// grouping by designation
		
		Map<String,List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		collect.forEach((designation,employees)->{
			System.out.println(designation);
			employees.forEach(System.out::println);
		});
		
		System.out.println("=============================");
		
		list.stream().filter(empl->empl.getDesignation().equals("Developer")).forEach(System.out::println);
		
		System.out.println("=============================");
		
		boolean allMatch = list.stream().allMatch(emplo->emplo.getAge()>18);
		System.out.println(allMatch);
		
		System.out.println("=============================");
		
		list.stream().filter(employee->employee.getAge()>18).forEach(System.out::println);
		
		System.out.println("=============================");
		
		list.stream().map(e->e.getAge()+10).collect(Collectors.toList()).forEach(System.out::println);
		list.forEach(System.out::println);

		System.out.println("=============================");
		
//		list.stream().map(e->e.setEmployeeId(1)).forEach(System.out::println);
//		
//		list.stream().re
	}
}
