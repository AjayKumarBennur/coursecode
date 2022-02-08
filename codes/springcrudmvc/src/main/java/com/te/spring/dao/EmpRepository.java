package com.te.spring.dao;

import com.te.spring.dto.Employee;

public interface EmpRepository {
	public boolean save(Employee emp);

	public boolean delete(int id);
}
