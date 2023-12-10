package com.kn.multithreading7;

public class Jerry implements Runnable {
	Hospital h;
	@Override
	public void run() {
		h.treatJerry();
	}
	public Jerry(Hospital h) {
		super();
		this.h = h;
	}

}
