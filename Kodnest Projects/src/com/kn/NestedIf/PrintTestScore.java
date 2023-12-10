package com.kn.NestedIf;

import java.util.Scanner;

public class PrintTestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your test details");
		System.out.print("Enter Test 1 Score : ");
		int t1 = sc.nextInt();	
		System.out.print("Enter Test 2 Score : ");
		int t2 = sc.nextInt();	
		System.out.print("Enter Test 3 Score : ");
		int t3 = sc.nextInt();	
		isPassed(t1,t2,t3);
	}

	static void isPassed(int t1, int t2, int t3) {
		if(t1>=50 && t2>=50 && t3>=50) {
			System.out.println("Passed All Subjects");
		}else {
			long avg = (t1+t2+t3)/3;
			if(avg>=50) {
				System.out.println("Avearage Score Passed");
			}
		}
		
	}
}


/*
Enter your test details
Enter Test 1 Score : 60
Enter Test 2 Score : 70
Enter Test 3 Score : 80
Passed All Subjects

Enter your test details
Enter Test 1 Score : 60
Enter Test 2 Score : 70
Enter Test 3 Score : 80
Passed All Subjects



 */
