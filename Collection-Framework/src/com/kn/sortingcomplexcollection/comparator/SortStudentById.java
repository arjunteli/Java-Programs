package com.kn.sortingcomplexcollection.comparator;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.id > s2.id) {
			return 1; // for descending return -1;
		} else if (s1.id < s2.id) {
			return -1; // for descending return +1 here ;
		} else {
			return 0;
		}
		//logic for String comparison
		//return s1.getName().compareTo(s2.getName());
	}
	
}
