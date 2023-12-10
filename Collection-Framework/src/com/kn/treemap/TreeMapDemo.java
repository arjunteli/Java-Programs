package com.kn.treemap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, Object> map1 = new TreeMap<Integer, Object>();
		map1.put(1, 100);
		map1.put(2, 300);
		map1.put(3, 100);
		map1.put(4, new Student(2, "Seeta Mata", 10.00));
		map1.put(5, 800);
		map1.put(6, new Student(1, "Ram Ji", 10.00));
		map1.put(7, 900);
		System.out.println(map1);
		
	}

}
