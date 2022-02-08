package com.te.spring;

public class MarkerPen implements Pen{

	@Override
	public void write() {
		System.out.println("Writing on board with marker");
	}

}
