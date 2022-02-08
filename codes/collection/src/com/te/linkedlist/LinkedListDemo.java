package com.te.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<Bike> list = new LinkedList<Bike>();
		Bike bike = new Bike(1234, "Pulsar");
		Bike bike2 = new Bike(4039, "Maestro");
		Bike bike3 = new Bike(4039, "Maestro");
		bike.setHours(1);
		bike2.setHours(2);
		bike3.setHours(5);
		//Adding to the list
		list.add(bike);
		list.add(bike3);
		list.add(bike2);
		
		for(Bike b : list) {
			System.out.println(b);
		}
		
		Collections.sort(list,new Bike());
		for(Bike b : list) {
			System.out.println(b);
		}
		
		
	}
}
