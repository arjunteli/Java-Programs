package com.kn.NestedIf;

import java.util.Scanner;

public class HonorsDegree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter GPA : ");
		float GPA = sc.nextFloat();
		System.out.print("Enter Total Credit : ");
		int credit = sc.nextInt();
		boolean bl = isEligible (GPA,credit) ;	
		if(bl) {
			System.out.println("Eligible for Honors Degree");
		}
	}

	static boolean isEligible(float GPA, int credit) {
		if(GPA > 3.5) {
			if(credit>120) {
				return true;
			}
		}
		return false;
	}

}

/* 
Enter GPA : 3.7
Enter Total Credit : 126
Eligible for Honors Degree


Enter GPA : 3.6
Enter Total Credit : 100

*/
