package com.te.rest.daol;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.te.rest.dto.StudentInfo;

@Repository
public class StudentDaoHibernateImpl implements StudentDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean register(StudentInfo info) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			manager.close();
		}
	}

}
