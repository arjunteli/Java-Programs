//7. Write a Java program to search for an element in an array list.
//8. Write a Java program to sort a given array list.

package com.kn.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Question7 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Orange");
		list.add("Red");
		list.add("Yellow");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		searchElement(list, list.get(3));

	}

	private static void searchElement(ArrayList<String> list, String key) {
		Collections.sort(list);
		int left = 0;
		int right = list.size() - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (list.get(mid).equals(key)) {
				System.out.println(key + " found at index " + mid);
				return;
			} else {
				left++;
				right--;
			}
		}
	}

}
