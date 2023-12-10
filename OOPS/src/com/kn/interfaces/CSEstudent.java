package com.kn.interfaces;

public class CSEstudent implements Student{
	
	@Override
	public void doProjects() {

		System.out.println("Doing Project on Library Management");
		
	}

	@Override
	public void study() {
		System.out.println("Studying ALGORITHMS");
	}
}
