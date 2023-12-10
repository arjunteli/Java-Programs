//12. Write a Java program to extract a portion of an array list.

package com.kn.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Question12 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(78);
		list.add(23);
		list.add(3);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(6);
		List subList = list.subList(0, 6);
		System.out.println("SubList from 0 to 5 = " + subList);
	}

}
