package com.te.spring.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.te.spring")
public class Config {
	
	@Bean
	public Battery getBattery() {
		return new Battery();
	}
	
}
