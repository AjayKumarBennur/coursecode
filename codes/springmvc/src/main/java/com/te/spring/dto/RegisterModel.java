package com.te.spring.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Register")
public class RegisterModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String password;
	Long phoneNumber;
	String email;
	String gender;
}
