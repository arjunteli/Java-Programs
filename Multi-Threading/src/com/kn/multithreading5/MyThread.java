package com.kn.multithreading5;

public class MyThread implements Runnable {

	@Override
	public  void run() {
		if(Thread.currentThread().getName().equals("Numbers")) {
			printNumbers();
			
		}else {
			printCharacters();
			
		}
	}
	
	public void printNumbers() {
		System.out.println("===>  printNumbers() method has started......");
		for(int i = 0; i<11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>  printNumbers() method has completed......");
	}
	
	public void printCharacters() {
		System.out.println("===>  printCharacters() method has started......");
		for(int i = 65; i<75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===>  printCharacters() method has completed......");
	}
}
