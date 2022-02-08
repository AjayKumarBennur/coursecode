package com.te.springwithoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.te.springwithoutxml")
@Component
public class Pet {
	@Value("Boss")
	String name;
	@Autowired
	@Qualifier("cat")
	Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Animal getAnimal() {
		return animal;
	}
	
	public void comeHere() {
		System.out.println(name);
		animal.eat();
		animal.sound();
	}
	
}
