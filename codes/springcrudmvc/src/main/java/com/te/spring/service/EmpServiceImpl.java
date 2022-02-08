package com.te.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.spring.dao.EmpJpaRepo;
import com.te.spring.dao.EmpRepository;
import com.te.spring.dto.Employee;

@Service
public class EmpServiceImpl implements EmployeeService {

	@Autowired
	EmpJpaRepo repo;
	
	@Override
	public boolean save(Employee emp) {
		if(repo.save(emp)==null)
			return false;
		return true;
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
