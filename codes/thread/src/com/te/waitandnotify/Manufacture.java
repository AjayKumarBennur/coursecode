package com.te.waitandnotify;

public class Manufacture extends Thread{
	GoDown goDown;
	int item;
	public Manufacture(GoDown goDown, int item) {
		super();
		this.goDown = goDown;
		this.item = item;
	}
	
	@Override
	public void run() {
		goDown.store(item);
	}
	
}
