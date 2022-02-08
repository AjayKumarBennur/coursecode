package com.te.email.service;

import org.springframework.stereotype.Service;

import com.te.email.dto.UserInfo;

@Service
public interface UserService {

	boolean validate(UserInfo obj);

	boolean save(UserInfo user);
	
	
}
