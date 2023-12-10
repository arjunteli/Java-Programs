package com.kn.multithreading3;

public class PrintChar extends Thread{

	public void run() {
		PrintChar t2 = new PrintChar();
		for(int i = 65; i<70; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println((char)(i));
		}
	}
}
