package com.te.exception.throwdemo;

public class ThrowDemo {
	public static void main(String[] args) {
		Licsence licsence = new Licsence("Ajay", 0);
		try {
		licsence.validate();
		licsence.generate();
		}catch (LicsenceException e) {
			System.out.println(e.msg);
		}
	}
}
