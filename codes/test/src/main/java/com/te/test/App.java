package com.te.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setId(1);
		laptop.setBrand("Dell");
		laptop.setVersion("Latitude");
		Employees employees = new Employees();
		employees.setId(101);
		employees.setName("Ajay");
		employees.setLaptop(laptop);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employees");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(employees);
		transaction.commit();
	}
}
