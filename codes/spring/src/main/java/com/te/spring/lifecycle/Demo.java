package com.te.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean,DisposableBean{
	
	Demo(){
		System.out.println("Instantiate........	");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("intializing .........");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying the obejct...........");
	}
	public void m1() {
		System.out.println("Method m1 from demo");
	}
	
}
