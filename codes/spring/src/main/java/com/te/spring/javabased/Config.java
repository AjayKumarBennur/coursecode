package com.te.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Child getChild() {
		return new Child();
	}
	
	@Bean
	public Parent getParent() {
		return new Parent();
	}
}
