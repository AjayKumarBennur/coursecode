package com.te.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.spring.dto.Employee;

@Repository
public class EmpDaoRepo implements EmpRepository{

	@Override
	public boolean save(Employee emp) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		return true;
	}

}
