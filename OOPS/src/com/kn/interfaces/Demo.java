package com.kn.interfaces;

public class Demo {

	public static void main(String[] args) {
		CSEstudent cs = new CSEstudent();
		MechStudent me = new MechStudent();
		callMethods(cs);
		callMethods(me);
	}
	public static void callMethods(Student s) {
		s.study();
		s.doProjects();
	}

}
