package com.te.spring.javabased;

import org.springframework.beans.factory.annotation.Value;

public class Child {
	@Value("Ajay")
	String name;

	@Override
	public String toString() {
		return "Child [name=" + name + "]";
	}
}
