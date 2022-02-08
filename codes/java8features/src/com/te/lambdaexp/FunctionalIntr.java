package com.te.lambdaexp;

public interface FunctionalIntr {
	//void message();
	
	int add(int i,int j);

	default void add() {
		System.out.println("Ajay");
	}
}
