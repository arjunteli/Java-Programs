package com.kn.studentutility;

public class StudentApp {
	public static void main(String[] args) {
		StudentUtility[] srr =  StudentUtility.createObjects();
//		StudentUtility s1 = new StudentUtility(01,"Amit", 83);
//		StudentUtility s2 = new StudentUtility(02,new String("Ankur"), 29);
//		StudentUtility s3 = new StudentUtility(03,"Aakash", 90);
//		StudentUtility s4 = new StudentUtility(04,"Amol", 36);
//		StudentUtility s5 = new StudentUtility(05,"Ranveer", 100);
//		StudentUtility s6 = new StudentUtility(06,"VIRAT", 42);
//		StudentUtility srr[] = {s1,s2,s3,s4,s5,s6,};
		
		
		System.out.println("\n*********************************************************\n");
		StudentUtility.searchStudentBasedOnId(srr);
		
		System.out.println("\n*********************************************************\n");
		StudentUtility.searchStudentBasedOnName(srr);
		
		System.out.println("\n*********************************************************\n");
		System.out.println("Sorted in ascending marks ");
		StudentUtility.sortingBasedOnMarks(srr);
		
		System.out.println("\n*********************************************************\n");
		StudentUtility.graceMarks(srr);
		
		System.out.println("\n*********************************************************\n");
		StudentUtility.rateApplication();
	}
}
