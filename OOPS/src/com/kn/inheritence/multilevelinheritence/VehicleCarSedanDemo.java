package com.kn.inheritence.multilevelinheritence;

public class VehicleCarSedanDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.resistrationNumber = 111;
		
		Car car = new Car();
		car.resistrationNumber = 222;
		
		Sedan sedan = new Sedan();
		sedan.resistrationNumber = 333;
		
		System.out.println("Vehicle Resistration = "+ vehicle.resistrationNumber);
		vehicle.move();
		System.out.println("Car Resistration = "+ car.resistrationNumber);
		vehicle.move();
		System.out.println("Sedan Resistration = "+ sedan.resistrationNumber);
		vehicle.move();
	}

}
