package com.kn.sortingcomplexcollection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(11, "Monish", 78.56f);
		Student s2 = new Student(33, "Dharam", 88.56f);
		Student s3 = new Student(22, "Karan", 98.56f);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		String str = new String("String Dummy");
		System.out.println(str.toString());
		
		ArrayList<Student> list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
