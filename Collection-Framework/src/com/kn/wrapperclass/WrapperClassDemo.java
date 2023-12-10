package com.kn.wrapperclass;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Auto-Boxing
		list.add(10); // -----> internally adding as list.add(new Integer(10));
		list.add(10); // -----> internally adding as list.add(new Integer(10));
		list.add(10); // -----> internally adding as list.add(new Integer(10));

		// Auto-Unboxing
		int i = list.get(0); // (int)list.get(0);

	}

}
