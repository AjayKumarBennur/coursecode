package com.te.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> list=Arrays.asList(
				new Employee(101, 23, "Ajay", 14000.00, "Developer"),
				new Employee(100, 33, "Manju", 24000.00, "Tester"),
				new Employee(102, 13, "Vanu", 10000.00, "HR"),
				new Employee(106, 30, "Akhsaya", 24000.00, "Developer"),
				new Employee(105, 25, "Akil", 15000.00, "Tester"));
		//without stream
//		Employee e=list.get(0);
//		for (Employee employee : list) {
//			if (employee.getAge()>e.getAge()) {
//				e=employee;
//			}
//		}
//		System.out.println(e);
		
//		Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getAge));
//		System.out.println(max);
//		list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
//		list.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
		
//		Collections.sort(list);
//		list.forEach(System.out::println);
		
//		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//		list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
//		list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		
//		Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDesig));
//		collect.forEach((depart,col)->{
//			System.out.println(depart);
//			col.forEach(System.out::println);
//		});
		
//		boolean allMatch = list.stream().allMatch(emp->emp.getAge()>=18);
//		boolean allMatch = list.stream().allMatch((emp)->{
//			return emp.getAge()>=18;
//		});
//		System.out.println(allMatch);
	
		list.stream()
					.filter(emp->emp.getDesig().equals("Developer"))
					.collect(Collectors.toList())
					.forEach(System.out::println);
	}
}
