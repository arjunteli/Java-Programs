package com.kn.multithreading4;

public class Demo {
	public static void main(String[] args) {
		PrintCharacter pc = new PrintCharacter();
		PrintNumber pn = new PrintNumber();
		
		Thread t1 = new Thread(pc);
		Thread t2 = new Thread(pn);
		
		t1.start();
		t2.start();
		
	}
}
