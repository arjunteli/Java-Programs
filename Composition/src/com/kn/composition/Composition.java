package com.kn.composition;

public class Composition {
	public static void main(String[] args) {
		Book book = new Book("Shrimad Bhagavat Geeta", 500);
		book.readBook();
		book.pages.displayContent();
		
		System.out.println("-------->BOOK has been stolen.");
		book = null;
		
		//book.pages.displayContent();//will give nullpointerexeption
	}
}
