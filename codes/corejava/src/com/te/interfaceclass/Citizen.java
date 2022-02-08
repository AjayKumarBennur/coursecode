package com.te.interfaceclass;

public class Citizen implements Calculator{

	@Override
	public void add(int number1, int number2) {
		System.out.println(number1+number2);
	}

	@Override
	public void multiply(int number1, int number2) {
		System.out.println(number1*number2);
	}

	@Override
	public void divsion(int number1, int number2) {
		System.out.println(number1/number2);
	}

	@Override
	public void substraction(int number1, int number2) {
		System.out.println(number1-number2);
	}

}
