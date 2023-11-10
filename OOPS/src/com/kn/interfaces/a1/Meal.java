package com.kn.interfaces.a1;

public class Meal implements MainCourse, Dessert, Starter {

	@Override
	public void manchchurian() {
		// TODO Auto-generated method stub
		System.out.println("Gobhi Manchurian");
		
	}

	@Override
	public void gulabJamun() {
		System.out.println("Gulab Jamun with ice-cream");
	}

	@Override
	public void biryani() {
		System.out.println("Paneer Biryani");
	}
	
}
