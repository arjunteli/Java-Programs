package com.kn.multithreading6;

public class Treatment implements Runnable {
	Hospital h;

	@Override
	synchronized public void run() {
		try {
			System.out.println("Treatment started for "+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("Treatment in-progress for "+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("Treatment completed for "+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Treatment(Hospital h) {
		this.h = h;
	}
	
	
}
