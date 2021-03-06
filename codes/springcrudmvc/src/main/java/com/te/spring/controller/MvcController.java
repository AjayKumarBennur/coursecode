package com.te.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.spring.dto.Employee;
import com.te.spring.service.EmployeeService;

@Controller
public class MvcController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/add")
	public String getinsert() {
		return "insert";
	}
	
	@PostMapping("/add")
	public String add(Employee emp) {
		if(service.save(emp))
			return "success";
		return "failure";
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam int id) {
		service.delete(id);
		return "success";
	}
}
