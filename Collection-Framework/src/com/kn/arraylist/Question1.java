//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.


package com.kn.arraylist;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Orange");
		list.add("Red");
		list.add("Yellow");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		System.out.println(list);
	}

}
