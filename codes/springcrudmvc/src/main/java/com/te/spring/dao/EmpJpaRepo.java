package com.te.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.spring.dto.Employee;

@Repository
public interface EmpJpaRepo extends CrudRepository<Employee, Integer>{

	 
}
