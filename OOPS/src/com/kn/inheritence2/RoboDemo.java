package com.kn.inheritence2;

public class RoboDemo {

	public static void main(String[] args) {
		ChefRobo chef = new ChefRobo();
		DriverRobo driver = new DriverRobo();
		TeacherRobo teacher = new TeacherRobo();
		chef.talk();
		driver.drive();
		teacher.teach();
		chef.name = "ARJUN";
		driver.name = "DriverBeta";
		System.out.println(chef.name);
		System.out.println(driver.name);
	}

}
