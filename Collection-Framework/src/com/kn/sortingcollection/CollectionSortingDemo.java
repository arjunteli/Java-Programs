package com.kn.sortingcollection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(199);
		list.add(34);
		list.add(56);
		list.add(200);
		list.add(34);
		list.add(15);
		System.out.println("List before sorting = "+ list);
		Collections.sort(list);
		System.out.println("List after sorting = " +list);
		
		
	}

}
