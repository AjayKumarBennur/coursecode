package com.te.interfacedemo;

public interface Demo {
	default void message() {
		System.out.println("Hello Guys");
	}
	void greet();
}
