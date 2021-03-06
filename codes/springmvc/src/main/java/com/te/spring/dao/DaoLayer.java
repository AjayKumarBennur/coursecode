package com.te.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.te.spring.dto.LoginModel;
import com.te.spring.dto.RegisterModel;

@Component
public class DaoLayer {
	
	public EntityManager getEntitiEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dao");
		EntityManager manager = emf.createEntityManager();
		return manager; 
	}
	
	public boolean save(RegisterModel reg) {
		try {
		EntityManager	manager = getEntitiEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(reg);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean validate(LoginModel reg) {
		String s= "from RegisterModel where name=?1";
		EntityManager manager = getEntitiEntityManager();
		Query createQuery = manager.createQuery(s);
		createQuery.setParameter(1,reg.getUsername());
		RegisterModel singleResult = (RegisterModel) createQuery.getSingleResult();
		if(singleResult.getPassword().equals(reg.getPassword())){
			return true;
		}
		return false;
	}
}
