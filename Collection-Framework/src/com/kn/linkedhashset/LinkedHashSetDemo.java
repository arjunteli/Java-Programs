package com.kn.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(75);
		set.add(45);
		set.add(16);
		set.add(21);
		set.add(32);
		System.out.println(set);
	}

}
