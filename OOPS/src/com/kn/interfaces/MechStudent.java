package com.kn.interfaces;

public class MechStudent implements Student {

	@Override
	public void study() {
		System.out.println("Studying CAD");
	}

	@Override
	public void doProjects() {
		System.out.println("Doing Project on robot");
		
	}

}
