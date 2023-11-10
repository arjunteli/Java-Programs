package com.kn.multithreading2;

public class MyThread extends Thread{
	
	public void run() {//Task of Thread
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
	}
}
