//10. a Java program to shuffle elements in an array list.

package com.kn.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {

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
		System.out.println("ArrayList before Shuffle = "+ list);
		Collections.shuffle(list);
		System.out.println("List after shuffle = "+ list);
	}

}
