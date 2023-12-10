package com.kn.simpleIf;

import java.util.Scanner;

public class RollerCoasterEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age in years : ");
		float age = sc.nextFloat();
		sc.close();
		isEligible(age);
	}

	static void isEligible(float age) {
		if(age>=12) {
			System.out.println("Ride access granted");
		}else {
			System.out.println("Ghar Jao Chupchap");
		}
	}
}


/*
Enter your Age in years : 15
Ride access granted

 * */
 