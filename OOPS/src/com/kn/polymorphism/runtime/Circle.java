package com.kn.polymorphism.runtime;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double calArea() {
		return 5*4.4;
	}
	public double check() {
		return 8.9;
	}

}
