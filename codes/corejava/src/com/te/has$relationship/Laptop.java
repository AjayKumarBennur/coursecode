package com.te.has$relationship;

public class Laptop {
	double cost;
	Battery battery;
	Ram ram;
	HardDisk hardDisk;
	
	public Laptop(double cost, Battery battery, Ram ram, HardDisk hardDisk) {
		this.cost = cost;
		this.battery = battery;
		this.ram = ram;
		this.hardDisk = hardDisk;
	}
		
	public void charge(Charger c) {
		System.out.println("Laptop is charging");
	}

	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", battery=" + battery + ", ram=" + ram + ", hardDisk=" + hardDisk + "]";
	}
	
	
}
