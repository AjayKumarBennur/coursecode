package com.te.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.rest.daol.StudentDao;
import com.te.rest.dto.StudentInfo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	
	StudentDao dao;
	@Override
	public StudentInfo register(StudentInfo info) {
		if(dao.register(info)) {
			info.setPassword(null);
			return info;
		}
		throw new RuntimeException("entity Already exist");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
}
