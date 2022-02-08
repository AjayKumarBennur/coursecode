package com.te.exception.throwdemo;

public class LicsenceException extends RuntimeException{
	String msg;
	public LicsenceException(String msg) {
		this.msg=msg;
	}
}
