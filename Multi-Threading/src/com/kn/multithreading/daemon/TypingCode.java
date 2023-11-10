package com.kn.multithreading.daemon;

public class TypingCode extends Thread {

	@Override
	public void run() {
		for(int i = 0; i<11; i++) {
			System.out.println("Typing Code....");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
