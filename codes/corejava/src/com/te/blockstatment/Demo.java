package com.te.blockstatment;

public class Demo extends Test{
	Demo(){
	System.out.println("Constructor from the Demo class");
	}
	{
		System.out.println("Instance block from the Demo class");
	}
	static{
		System.out.println("static block from the DEmo class");
	}
}
