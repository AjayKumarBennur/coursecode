package com.te.springwithoutxml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springwithoutxml.Cat;
import com.te.springwithoutxml.Dog;
import com.te.springwithoutxml.Pet;


public class AllConfig {
	
//	@Bean("Dog")
//	public Dog getDog() {
//		return new Dog();
//	}
//	
//	@Bean("Cat")
//	@Primary
//	public Cat getCat() {
//		return new Cat();
//	}
//	
//	@Bean
//	public Pet getPet() {
//		Pet pet = new Pet();
//		pet.setName("Boss");
//		return pet;
//	}
}
