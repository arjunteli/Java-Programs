package com.kn.polymorphism.runtime2;

public class Demo {
	public static void main(String[] args) {
//		//Declaring Reference of Parent 
//		Shape sh ;
//		//Up-Casting and Creating Object of Child Class
//		sh = new Rectangle();
//		//Inherited Method 
//		sh.draw();
//		//OverRidden Methods
//		System.out.println("Area = "+ sh.area());
//		
//		
//		//Down-Casting
//		System.out.println("Perimeter = " +((Rectangle) sh).perimeter());
		
		Geometry g = new Geometry();
		g.doActivity(new Rectangle());
		g.doActivity(new Circle());
		g.doActivity(new Square());
			
	}
}
