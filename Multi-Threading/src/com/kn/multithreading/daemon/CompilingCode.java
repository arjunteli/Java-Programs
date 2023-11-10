package com.kn.multithreading.daemon;

public class CompilingCode extends Thread {

	@Override
	public void run() {
		for(;;) {
			System.out.println("Compiling Code...");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
