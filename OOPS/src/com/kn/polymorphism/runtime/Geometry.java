package com.kn.polymorphism.runtime;

public class Geometry {
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calArea());
	}
}
