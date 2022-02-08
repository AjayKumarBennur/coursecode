package com.te.has$relationship;

public class Dell {
	
	public static void main(String[] args) {
		Battery battery = new Battery(4000, "Thoshiba");
		Ram ram = new Ram("intel i9", 8, 4 );
		HardDisk hardDisk = new HardDisk(256, "WD");
		
		Laptop laptop = new Laptop(42000, battery, ram, hardDisk);
		System.out.println(laptop.battery.amphere); 
		System.out.println(laptop.battery.brand);
		System.out.println(laptop.ram.capacity);
	}

}
