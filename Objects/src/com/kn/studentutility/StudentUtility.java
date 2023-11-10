package com.kn.studentutility;

import java.util.Scanner;


public class StudentUtility {

	public static Scanner sc = new Scanner(System.in);
	int id;
	String name;
	int marks;
	
	public StudentUtility(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public StudentUtility() {
		
	}

	public static StudentUtility[] createObjects() {
		System.out.print("Enter the number of objects to be created = ");
		StudentUtility[] srr = new StudentUtility[sc.nextInt()];
		for(int i = 0; i<srr.length; i++) {
			srr[i] = new StudentUtility();
			System.out.print("Student "+ (i+1) +" \n\tId = ");;
			srr[i].id = sc.nextInt();
			sc.nextLine();
			System.out.print("\tName = ");
			srr[i].name = sc.nextLine();
			System.out.print("\tMarks = ");
			srr[i].marks = sc.nextInt();
			
		}
		return srr;
	}
	
	public static void searchStudentBasedOnId(StudentUtility [] srr) {
		System.out.print("Enter id for searching = ");
		int id = sc.nextInt();
		for(StudentUtility s: srr) {
			if(s.id == id) {
				System.out.println("ID = "+s.id+"\tName = "+s.name+"\tMarks = "+s.marks);
				return;
			}
		}
	}
	
	public static void searchStudentBasedOnName(StudentUtility [] srr) {
		System.out.print("Enter Name for searching based on name = ");
		sc.nextLine();
		String name = sc.nextLine();
		for(StudentUtility s: srr) {
			if(s.name.equalsIgnoreCase(name)) {
				System.out.println("ID = "+s.id+"\tName = "+s.name+"\tMarks = "+s.marks);
				return;
			}
		}
		System.out.println("\t\tNOT FOUND");
	}
	
	public static void sortingBasedOnMarks(StudentUtility[] srr) {
		for(int i = 0; i<srr.length;i++) {
			boolean bl = true;
			for(int j = 0; j<srr.length-i-1; j++) {
				if(srr[j].marks > srr[j+1].marks) {
					bl = false;
					StudentUtility temp = srr[j];
					srr[j] = srr[j+1];
					srr[j+1] = temp;
				}
				
			}
			if(bl) {
				break;
			}
		}
		for(StudentUtility s: srr) {
			System.out.println("ID = "+s.id+"\tName = "+s.name+"\tMarks = "+s.marks);
		}
		
	}
	
	public static void graceMarks(StudentUtility[] srr) {
		for(StudentUtility i :srr) {
			if(i.marks <35) {
				System.out.println(i.name + "\n\tExisting Marks = " + i.marks);
				i.marks = 35;
				
				System.out.println("\tAfter Grace\n\tUpgraded Marks = "+i.marks);
			}
			
		}
	}
	public static void rateApplication() {
		System.out.print("Enter rating from 1 to 5 = ");
		int rate = sc.nextInt();
		if(rate<6 && rate >0) {
			for(int i = 0; i<rate; i++) {
				System.out.print("*");
			}	
		}else {
			System.out.println("Please Enter Valid number");
		}
		
	}
	
}
