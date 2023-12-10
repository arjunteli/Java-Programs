package com.kn.sortingcomplexcollection.comparable;

public class Student implements Comparable<Student> {
	int id;
	String name;
	float percentage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Student(int id, String name, float percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.id > o.id) {
			return 1; // for descending return -1;
		} else if (this.id < o.id) {
			return -1; // for descending return +1 here ;
		} else {
			return 0;
		}
	}

}
