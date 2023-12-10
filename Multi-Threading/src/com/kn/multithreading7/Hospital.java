package com.kn.multithreading7;

public class Hospital {
	String res1 = "Doctor";
	String res2 = "BED";

	public void treatTom() {
		synchronized (res1) {
			try {
				System.out.println("Doctor has been assigned to Tom");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (res2) {
				try {
					System.out.println("BED has been assigned to Tom");
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// DEADLOCK AS res2 will be locked and T1 Thread will wait for res2 get
	// unlocked.
	public void treatJerry() {
		synchronized (res2) {
			try {
				System.out.println("BED has been assigned to Jerry");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (res1) {
				try {
					System.out.println("Doctor has been assigned to Jerry");
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
