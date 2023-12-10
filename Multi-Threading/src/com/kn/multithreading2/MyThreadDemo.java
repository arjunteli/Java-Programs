package com.kn.multithreading2;

public class MyThreadDemo {

	public static void main(String[] args) {
		Thread t2 = Thread.currentThread();
		System.out.println(t2);
		MyThread t3 = new MyThread();
		t3.start();
		t3.setName("MyThread");
		t3.setPriority(6);
	}

}
