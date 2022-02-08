package com.te.abstractclass;

public class Labroder extends Dog{

	public Labroder(double weight, int bone) {
		super(weight, bone);
	}

	public void bark() {
		System.out.println("Labroder is barking");
	}

	public void eat() {
		System.out.println("Labroder is eating food");
	}
	
}
