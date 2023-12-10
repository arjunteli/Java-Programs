package com.kn.hashmap;

import java.util.HashMap;

import com.kn.treemap.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put(1,455);
		map1.put(2, 345);
		map1.put("Three",new  Student(1, "Ram Ji", 7.89));
		map1.put("Four", 102);
		map1.put(5, "Five stored");
		map1.put(5, "Six stored");
		map1.put(5, "Five stored");
		map1.put(5, "Five stored");
		System.out.println(map1);
		
	}

}
