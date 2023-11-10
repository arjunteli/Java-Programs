package com.kn.binarysearchobject;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(01,"Amit", 83);
		Student s2 = new Student(02,new String("Ankur"), 29);
		Student s3 = new Student(03,"Aakash", 90);
		Student s4 = new Student(04,"Amol", 36);
		Student s5 = new Student(05,"Ranveer", 100);
		Student s6 = new Student(06,"VIRAT", 42);
		Student srr[] = {s1,s2,s3,s4,s5,s6,};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Data = ");
		for(Student i:srr) {
			System.out.println("\tID = "+i.id + ", Name = "+ i.name+", Marks = "+i.marks);
		}
		System.out.println("\n\n\n*******************************");

		System.out.print("Enter key ID = ");
		int key = sc.nextInt();
		
		//Binary Search 
		int start=0;
		int end = srr.length-1;
		int mid;
		boolean bl = true;
		while(start<=end) {
			mid = start + (end-start)/2;
			if(srr[mid].id==key) {
				System.out.println("\tID = "+srr[mid].id + ", Name = "+ srr[mid].name+", Marks = "+srr[mid].marks);
				bl = false;
				break;
			}else if (srr[mid].id<key) {
				start = mid+1;
			}else {
				end = mid -1;
			}
			
		}
		if(bl) {
			System.out.println("\t\tNOT FOUND ");
		}
		sc.close();
		
	}

}
