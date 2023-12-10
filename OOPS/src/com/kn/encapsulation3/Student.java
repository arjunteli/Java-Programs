package com.kn.encapsulation3;

public class Student {
	int rollNumber;
	String name;
	int marks;
	String gender;
	public Student(int rollNumber, String name, int marks, String gender) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
