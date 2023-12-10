//9. Write a Java program to copy one array list into another.

package com.kn.arraylist;

import java.util.ArrayList;

public class Ouestion9 {

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
		System.out.println("List 1 = " + list);
		System.out.println("****************************");
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(i));
		}
		System.out.println("List copied from list 1 = "+list2);
	}

}
