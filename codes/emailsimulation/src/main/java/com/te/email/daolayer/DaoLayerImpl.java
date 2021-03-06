package com.te.email.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.email.dto.UserInfo;

@Repository
public class DaoLayerImpl implements DaoLayer {

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("email");
		EntityManager em = factory.createEntityManager();
		return em;
	}

	@Override
	public boolean validate(UserInfo obj) {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("from UserInfo where username =:name");
		query.setParameter("name", obj.getUsername());
		UserInfo singleResult = (UserInfo) query.getSingleResult();
		if (singleResult.getPassword().equals(obj.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean save(UserInfo user) {
		try {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
