package com.kn.wrapperclass;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UpcastingCollectionObject {

	public static void main(String[] args) {
		// Up-Casting with collection objects
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);

		List list2 = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);

		Queue que = new ArrayDeque();
		que.add(22);
		que.add(42);
		que.add(34);

		Queue que2 = new PriorityQueue();
		que.add(22);
		que.add(42);
		que.add(34);
	}

}
