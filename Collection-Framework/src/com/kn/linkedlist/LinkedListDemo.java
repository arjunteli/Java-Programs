package com.kn.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add("twenty");
		list1.add(2,55555);
		System.out.println(list1);
		
		System.out.println("Index of 10 " +list1.indexOf("twenty"));
		list1.add(10);
		System.out.println(list1.lastIndexOf(10));
		
	}

}
