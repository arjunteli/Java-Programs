package com.kn.polymorphism.runtime;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return 50*3.3;
	}

}
