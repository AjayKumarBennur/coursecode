package com.te.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Demo demo = new Demo(1, "Akshay", "Kumar");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		/*
		 * Inserting the data into the DB
		 */
		  em.persist(demo);
		  transaction.begin();
		  transaction.commit();
		  
		  emf.close();
		  em.close();

		/*
		 * Fetching particular data from the DB
		 */
//		Demo find = em.find(Demo.class,1);
//		System.out.println(find);
//		Demo reference = em.getReference(Demo.class, 1);
//		System.out.println(reference.getName());

		/*
		 * Updating the data
		 */

//		Demo find = em.find(Demo.class, 1);
//		if(find!=null) {
//			find.setName("Ajay");
//			find.setLastname("Bennur");
//		}
//		transaction.begin();
//		transaction.commit();

		/*
		 * Deleting the data
		 */
//		Demo find = em.find(Demo.class, "Ajay");
//		if (find != null) {
//			em.remove(find);
//			transaction.begin();
//			transaction.commit();
//		}

	}
}
