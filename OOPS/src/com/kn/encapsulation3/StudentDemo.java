package com.kn.encapsulation3;

public class StudentDemo {
	public static void main(String[] args) {
		Student obj1  = new Student(1, "Shraddha", 99, "Female");
		System.out.println("RollNUmber = "+ obj1.getRollNumber());
		System.out.println("Name = " + obj1.getName());
		System.out.println("Marks = "+ obj1.getMarks());
		System.out.println("Gender = "+obj1.gender);
	}
}
