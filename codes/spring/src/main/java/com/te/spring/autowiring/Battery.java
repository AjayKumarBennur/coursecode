package com.te.spring.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Battery {
	@Value("Huwaei")
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
}
