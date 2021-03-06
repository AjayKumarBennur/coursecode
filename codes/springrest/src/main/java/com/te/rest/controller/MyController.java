package com.te.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.rest.model.Employee;

@RestController
@RequestMapping(path = "/user")
public class MyController {
	
	@GetMapping(path = "/", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Employee> getData(Employee emp) {
		
			return new ResponseEntity(emp, HttpStatus.OK);
	}

	@DeleteMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> delete(@PathVariable(name = "id") int eid) {
			return new ResponseEntity(new Object() , HttpStatus.OK);
	}
	
	@PostMapping(path = "/", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
	,consumes =  { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
	)
	public ResponseEntity<Object> add(@RequestBody Employee emp) {
			return new ResponseEntity(new Object() , HttpStatus.OK);
	}
	
	
}
