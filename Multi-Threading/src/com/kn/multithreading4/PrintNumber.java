package com.kn.multithreading4;

public class PrintNumber implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 1;i<=10; i++) {
			System.out.println("Numbers = "+ i);		}
	}

}
