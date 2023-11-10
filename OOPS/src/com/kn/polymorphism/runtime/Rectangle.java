package com.kn.polymorphism.runtime;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double calArea() {
		return 10.5 * 5.5;
	}
	
}
