package com.kn.multithreading6;

public class Hospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Treatment treatment = new Treatment(h);
		Thread t1 = new Thread(treatment);
		Thread t2 = new Thread(treatment);
		t1.setName("Tom");
		t2.setName("Jerry");
		t1.start();
//		try {
//			t1.join();
//			System.out.println();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
	}

}
