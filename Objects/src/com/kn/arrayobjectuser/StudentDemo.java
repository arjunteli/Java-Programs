package com.kn.arrayobjectuser;

import java.util.Scanner;


public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of objects to be created = ");
		int length = sc.nextInt();
		
		Student [] arr = new Student[length];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new Student();
			System.out.print("Student "+ (i+1) +" \n\tId = ");;
			arr[i].id = sc.nextInt();
			sc.nextLine();
			System.out.print("\tName = ");
			arr[i].name = sc.nextLine();
			System.out.print("\tMarks = ");
			arr[i].marks = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("****************************************");
		for(Student i :arr) {
			System.out.println("\tID = "+i.id + ", Name = "+ i.name+", \tMarks = "+i.marks);
		}
		sc.close();
		
	}

}


