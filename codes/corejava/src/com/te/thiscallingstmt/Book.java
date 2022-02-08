package com.te.thiscallingstmt;

public class Book {
	String title;
	String author;
	double price;
	int pages;
	
	public Book(String title,double price, int pages) {
		this.title=title;
		this.price = price;
		this.pages = pages;
	}

	public Book(String title, String author, double price, int pages) {
		this(title,price,pages);
		this.author=author;
	}
	
	
	public void display() {
		System.out.println("Title : "+title);
		System.out.println("Author: "+author);
		System.out.println("price: "+price);
		System.out.println("pages: "+pages);
		
	}
}
