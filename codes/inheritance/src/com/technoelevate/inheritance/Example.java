package com.technoelevate.inheritance;

public class Example {
	public static void main(String[] args) {
		SmartPhone samsung = new SmartPhone(10000, 2, 8, 256, 6.5);
		samsung.call();
		samsung.playRadio();
		samsung.playPubg();
		samsung.mediaPlayer();
		System.out.println("============");
		Phone nokia = new Phone(1200, 2);
		nokia.call();
		nokia.playRadio();
	}
}
