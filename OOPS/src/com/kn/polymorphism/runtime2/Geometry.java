package com.kn.polymorphism.runtime2;

public class Geometry {
	public void doActivity(Shape sh) {
		
		sh.draw();
		System.out.println( "Area = "+sh.area());
		
		if(sh instanceof Rectangle) {
			System.out.println("Rectangle Perimeter = "+ ((Rectangle) sh).perimeter());
		}else if(sh instanceof Circle) {
			System.out.println("Circle Perimeter = "+ ((Circle) sh).perimeter());
		}else {
			System.out.println("Square Perimeter = "+ ((Square) sh).perimeter());
		}
		System.out.println("-----------------------------------------------------------");
	}
}
