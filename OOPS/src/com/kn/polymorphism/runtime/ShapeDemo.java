package com.kn.polymorphism.runtime;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Geometry g = new Geometry();
		Shape sh = new Shape();
		//Rectangle
		sh = new Rectangle();
		g.doActivity(sh);
		//Square
		sh= new Square();
		g.doActivity(sh);
		
		//Circle
		sh= new Circle();
		g.doActivity(sh);
		
	}

}
