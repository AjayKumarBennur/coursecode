package com.te.interfacedemo;

public interface Demo2 {
	default void  message() {
		System.out.println("WelCome Guys");
	}
}
