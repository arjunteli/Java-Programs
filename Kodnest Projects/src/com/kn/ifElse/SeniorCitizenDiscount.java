package com.kn.ifElse;

import java.util.Scanner;

public class SeniorCitizenDiscount {
	public static void  discount(int age ) {
		if(age>=60) {
			System.out.println("Senior Citizen Discount Applicable");
		}else {
			System.out.println("Regular Charges Applicable");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		discount(age);
		sc.close();
	}
}

/*
Enter your age : 65
Senior Citizen Discount Applicable
 
Enter your age : 45
Regular Charges Applicable

 */
 