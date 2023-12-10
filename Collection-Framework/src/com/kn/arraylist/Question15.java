//15. Write a Java program to join two array lists.

package com.kn.arraylist;

import java.util.ArrayList;

public class Question15 {
	
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
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("White");
		list2.add("Pink");
		ArrayList <Object> list3 = new ArrayList<Object>();
		list3.addAll(list);
		list3.addAll(list2);
		System.out.println(list3);


	}

}
