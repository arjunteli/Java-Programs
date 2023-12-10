//11. Write a Java program to reverse elements in an array list.

package com.kn.arraylist;

import java.util.ArrayList;

public class Question11 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("List = " + list);
		System.out.println("***************");
		System.out.println("Reversed List = " + reverse(list));// Collections.reverse
	}

	private static ArrayList<Integer> reverse(ArrayList<Integer> list) {
		int left = 0;
		int right = list.size() - 1;

		while (left <= right) {
			int temp = list.get(right);
			list.set(right, list.get(left));
			list.set(left, temp);
			left++;
			right--;
		}
		return list;
	}

}
