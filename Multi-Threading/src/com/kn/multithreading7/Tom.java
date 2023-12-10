package com.kn.multithreading7;

public class Tom implements Runnable {
	
	Hospital h;
	
	public Tom(Hospital h) {
		super();
		this.h = h;
	}

	@Override
	public void run() {
		h.treatTom();
	}
}
