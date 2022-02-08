package com.te.abstractclass;

public  class Dog {
	double weight;
	int bone;

	public Dog(double weight, int bone) {
		super();
		this.weight = weight;
		this.bone = bone;
	}

//	public abstract void bark();
    
//	public abstract void eat();

	public void poop() {
		System.out.println("Dog is pooping");
	}
}
