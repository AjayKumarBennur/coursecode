package com.te.email.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.email.daolayer.DaoLayer;
import com.te.email.dto.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	DaoLayer dao;
	
	@Override
	public boolean validate(UserInfo obj) {
		return dao.validate(obj);
	}

	@Override
	public boolean save(UserInfo user) {
		if(user==null)
			return false;
		return dao.save(user);
	}

}
