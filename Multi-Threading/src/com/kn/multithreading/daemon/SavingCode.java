package com.kn.multithreading.daemon;

public class SavingCode extends Thread {

	@Override
	public void run() {
		for(;;) {
			System.out.println("Saving Code....*****************");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
