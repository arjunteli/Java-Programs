package com.kn.concurrentmodification;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

class ConcurrentModificationDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet list = new CopyOnWriteArraySet();
		list.add(10);
		list.add(20);
		list.add(30);
		int temp = 40;
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
			list.add(temp+=40);
		}
	}

}
