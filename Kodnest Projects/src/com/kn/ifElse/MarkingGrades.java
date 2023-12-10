package com.kn.ifElse;

import java.util.Scanner;

public class MarkingGrades {
	public static void check (int marks) {
		if(marks >= 60) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks = ");
		int marks = sc.nextInt();
		check(marks);
		

	}

}
