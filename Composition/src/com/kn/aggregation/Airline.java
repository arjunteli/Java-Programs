package com.kn.aggregation;

public class Airline {
	String name;
	Pilot pilot;
	public void operation() {
		System.out.println(this.name + " has started operating services.......");
		pilot.fly();
	}
	public Airline(String name, Pilot pilot) {
		this.name = name;
		this.pilot = pilot;
	}
}
