package com.kn.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addFirst(200);
		ad.addLast(550);
		System.out.println(ad);
	}

}
