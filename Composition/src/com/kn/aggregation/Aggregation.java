package com.kn.aggregation;

public class Aggregation {
	public static void main(String[] args) {
		Pilot pilot = new Pilot("Arjun Teli");
		Airline airline = new Airline("AKASA", pilot);
		
		airline.operation();
		
		airline = null;//airline shutdown // NO ACTIVE REFERENCE FOR AIRLINE OBJECT // no owner
		
		pilot.fly();//still owned remain exist
	}
}
