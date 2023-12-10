//14. Write a Java program that swaps two elements in an array list.

package com.kn.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Question14 {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("List Before Swap = " + c1);
		System.out.println("************************");
		Collections.swap(c1, 1, 3);
		System.out.println("List after Swap = " + c1);
	}
}
