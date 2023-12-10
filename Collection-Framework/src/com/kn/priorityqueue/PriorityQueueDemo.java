package com.kn.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(40);
		pq.add(5);//will add first this as it is smallest element
		System.out.println(pq);//
		
		PriorityQueue pq2 = new PriorityQueue();
		pq2.add("Arjun");//will add this first as lexicographically order
		pq2.add("teli");
		pq2.add("modi");
		pq2.add("sahu");
		pq2.add("nenawa");
		System.out.println(pq2);
	}

}
