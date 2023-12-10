package com.kn.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(20);
		set.add(15);
		set.add(5);
		set.add(27);
		set.add(27);
		set.add(27);
		set.add(27);
		set.add(2);
		System.out.println(set);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("apple");
		set2.add("Mango");
		set2.add("Kiwi");
		set2.add("Apple");
		set2.add("Apple");
		set2.add("Apple");
		set2.add("Banana");
		System.out.println(set2);
		
		
	}

}
