package com.kn.multithreading.daemon;

public class DaemonDemo {
	public static void main(String[] args) {
		//Instantiate Objects
		TypingCode t1 = new TypingCode();
		CompilingCode t2 = new CompilingCode();
		SavingCode t3 = new SavingCode();
	
		//Set Threads as Daemon Thread
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		//Start all Threads
		t1.start();
		t2.start();
		t3.start();
				
	}
}
