package com.te.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setCid(1);
		cart.setCname("AjayCArt");
		
		Item item = new Item();
		item.setId(1);
		item.setIname("Shoes");
		item.setCart(cart);
		
		Item item2 = new Item();
		item2.setId(2);
		item2.setIname("Shirts");
		item2.setCart(cart);
		
		List<Item> items = new ArrayList<>();
		items.add(item);
		items.add(item2);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(item);
		em.persist(item2);
		em.persist(cart);
		transaction.commit();
		
		
		
		
	}
}
