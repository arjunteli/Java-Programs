package com.kn.multithreading3;

public class PrintNum extends Thread {
	
	public void run() {
		PrintNum t1 = new PrintNum();
		for(int i = 1; i<6; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(t1);
			System.out.println("Numbers = "+i);
		}
	}
}
