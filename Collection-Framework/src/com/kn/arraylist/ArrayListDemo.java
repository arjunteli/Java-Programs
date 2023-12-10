package com.kn.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add("TEN");
		list1.add(10.789);
		list1.add('a');
		list1.add(true);
		list1.add(10);
		list1.add(list1.size());
		System.out.println(list1);
		//System.out.println(list1.size());
		
		ArrayList list2 = new ArrayList();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.addAll(list1);//will add all element of list 1 sequentially at the end
		System.out.println(list2);
		
		list2.addAll(2,list1);//will add all element of list 1 sequentially at the specified index
		System.out.println(list2);
		
		
	}
}
