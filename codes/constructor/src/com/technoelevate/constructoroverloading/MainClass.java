package com.technoelevate.constructoroverloading;

public class MainClass {
	public static void main(String[] args) {
		ConstructorOverloading constructorOverloading = new ConstructorOverloading();
		constructorOverloading.id=1;
		constructorOverloading.name="Ajay";
		constructorOverloading.details();
		
		ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(2,"Kumar");
		constructorOverloading2.details();
		
	}
}
