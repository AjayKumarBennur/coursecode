package com.technoelevate.inheritance;

public class SmartPhone extends Phone {
	
	int ramSize;
	int rom;
	double screenSize;

	public SmartPhone(double price, int simSlot, int ramSize, int rom, double screenSize) {
		super(price, simSlot);
		this.ramSize = ramSize;
		this.rom = rom;
		this.screenSize = screenSize;
	}
	
	public void mediaPlayer() {
		System.out.println("Playing Song");
	}
	
	public void playPubg() {
		System.out.println("Opening Pubg");
	}

}
