//2. Write a Java program to iterate through all elements in an array list.
//3. Write a Java program to insert an element into the array list at the first position.
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5. Write a Java program to update an array element by the given element.
//6. Write a Java program to remove the third element from an array list.

package com.kn.arraylist;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Orange");
		list.add("Red");
		list.add("Yellow");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		System.out.println(list);

		// Question-2
		int i = 1;
		for (String s : list) {
			System.out.println(i + ". " + s);
			i++;
		}

		// Question-3
		list.add(0, "GREEN");
		System.out.println("*********************");
		i = 1;
		for (String s : list) {
			System.out.println(i + ". " + s);
			i++;
		}

		System.out.println("*********************");
		// Question-4
		System.out.println("Specied Index Element = " + list.get(4));

		// Question-5
		list.set(4, "Blue");
		System.out.println("Updated Element = " + list.get(4));

		// Question-6
		list.remove(3);
		System.out.println(list.get(3));
		
	}

}
