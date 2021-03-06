package com.te.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.rest.dto.StudentInfo;
import com.te.rest.dto.StudentResponse;
import com.te.rest.service.StudentService;

@RestController
public class MyController {

	@Autowired
	StudentService service;
	
	@PostMapping(path = "/student" , consumes   = MediaType.APPLICATION_JSON_VALUE,
			produces  = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> storeUserData(@RequestBody StudentInfo info) {
		System.out.println("hi");
		StudentResponse response = new StudentResponse(false,service.register(info));
		return new ResponseEntity<StudentResponse>(response, HttpStatus.OK);
	}
}
