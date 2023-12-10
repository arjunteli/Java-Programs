package com.kn.wrapperclass;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class TraversingDemo {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();

		list.add("Shirt");
		list.add("Jeans");
		list.add(10);
		list.add(true);

		// 1. for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("***********************************");

		// 2. for-each loop
		for (Object s : list) {
			System.out.println(s);
		}

		System.out.println("***********************************");

		// 3. Using Iterator
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 4. Using descendingIterator() method
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(256);
		ad.add(34);
		Iterator itr2 = ad.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
