package com.te.linkedlist;

import java.util.Comparator;

public class Bike implements Comparator<Bike>{
	int bikeNo;
	String name;
	int hours;
	
	public Bike() {}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Bike(int bikeNo, String name) {
		super();
		this.bikeNo = bikeNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", name=" + name + ", hours=" + hours + "]";
	}
	
	@Override
	public int compare(Bike o1, Bike o2) {
		return o2.hours-o1.hours;
	}
	
	
}
