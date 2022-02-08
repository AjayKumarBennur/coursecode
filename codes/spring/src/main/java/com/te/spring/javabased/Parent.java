package com.te.spring.javabased;

import org.springframework.beans.factory.annotation.Autowired;

public class Parent {
	@Autowired
	Child c;

	@Override
	public String toString() {
		return "Parent [c=" + c + "]";
	}
	
	
}
