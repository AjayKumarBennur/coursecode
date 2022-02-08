package com.te.hashset.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<Student>();
		Student student = new Student(7, "Rahul");
  		//System.out.println(student.hashCode());
		//System.out.println(student2.hashCode());
		hashSet.add(new Student(1, "Ajay"));
		hashSet.add(new Student(2, "Kumar"));
		hashSet.add(new Student(3, "akaka"));
		hashSet.add(new Student(4, "Manju"));
		hashSet.add(new Student(5, "Manju"));
		Iterator<Student> iterator = hashSet.iterator();
	
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=============");
		
		List list = new ArrayList(hashSet);
		Collections.sort(list,new SortByName());
		Iterator iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}
}
