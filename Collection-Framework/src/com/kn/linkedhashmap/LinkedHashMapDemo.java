package com.kn.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import com.kn.treemap.Student;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap map1 = new LinkedHashMap();
		map1.put(1,455);
		map1.put(2, 345);
		map1.put("Three",new  Student(1, "Ram Ji", 7.89));
		map1.put("Four", 102);
		map1.put(5, "Five stored");
		map1.put(5, "Six stored");
		map1.put(5, "Five stored");
		map1.put(5, "Five stored");
		System.out.println(map1);
		System.out.println("************************************");
		Set keys =  map1.keySet();
		System.out.println(  "Keys = "+keys);
		
		Set kv = map1.entrySet();
		System.out.println("Key-Value = "+ kv);
		
		Collection values = map1.values();
		System.out.println("Values = " + values);
		
		
	}

}
