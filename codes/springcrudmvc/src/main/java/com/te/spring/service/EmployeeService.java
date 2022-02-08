package com.te.spring.service;

import com.te.spring.dto.Employee;

public interface EmployeeService {
	
	public boolean save(Employee emp);

	public void delete(int id);
	
}
