package com.kn.polymorphism.runtime3;

public class DatabaseEngineer extends SoftwareEngineer {

	@Override
	public void attendMeeting() {
		// TODO Auto-generated method stub
		System.out.println("Database Engineer attend Database meeting.");
	}
	public void doDatabaseProject() {
		System.out.println("Database Engineer do Database projects.");
	}
	public void learnSQL() {
		System.out.println("Database Engineer learn SQL.");
	}
}
