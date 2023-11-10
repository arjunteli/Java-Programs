package com.kn.composition;

public class Book {
	String name;
	int noOfPages;
	Pages pages = new Pages("The Java");
	public Book(String name, int noOfPages) {
		super();
		this.name = name;
		this.noOfPages = noOfPages;
	}
	public void readBook() {
		System.out.print("Read Book");
	}
	
	
}
