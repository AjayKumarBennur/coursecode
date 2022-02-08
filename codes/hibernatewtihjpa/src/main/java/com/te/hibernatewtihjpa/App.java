package com.te.hibernatewtihjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setName("Dell");
		
		Laptop laptop2 = new Laptop();
		laptop2.setLid(102);
		laptop2.setName("HP");
		
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop);
		laptops.add(laptop2);
		List<Laptop> laptops2 = new ArrayList<>();
		laptops2.add(laptop2);
		
		Students students = new Students();
		students.setRollNo(1);
		students.setName("Ajay");
		students.setMarks(101.0);
		students.setLaptops(laptops);
		
		Students students2 = new Students();
		students2.setRollNo(2);
		students2.setName("Manju");
		students2.setMarks(2000.10);
		students2.setLaptops(laptops2);
		
		List<Students> student = new ArrayList<>();
		List<Students> student2 = new ArrayList<>();
		student.add(students);
		student.add(students2);
		
		student2.add(students2);
		
		laptop.setStudents(student2);
		laptop2.setStudents(student);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(students);
		em.persist(students2);
		em.persist(laptop);
		em.persist(laptop2);
		transaction.commit();
	}
}
