package com.te.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	
	int id;
	@Id
	String name;
	String lastname;
	public Demo() {
	}
	
	public Demo(int id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	
}
