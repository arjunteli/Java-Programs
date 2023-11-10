package com.kn.polymorphism.runtime2;

public class Rectangle extends Shape {

	@Override
	public double area() {
		double length = 9.3;
		double breadth = 4;
		return length*breadth;
	}
	
	public double perimeter() {
		return 5.4;
	}

}
