package com.kn.multithreading4;

public class PrintCharacter implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 65;i<=75; i++) {
			System.out.println("Numbers = "+ ((char)(i)));		}
	}
}
