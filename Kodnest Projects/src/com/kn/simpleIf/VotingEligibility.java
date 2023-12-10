package com.kn.simpleIf;

import java.util.Scanner;

public class VotingEligibility {

	public static void check(float age ) {
		if(age>=18) {
			System.out.println("Voting registration eligible");
		}else {
			System.out.println("Ghar Jao Chupchap");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age in years : ");
		float age = sc.nextFloat();
		check(age);

	}
}
/*
Enter your Age in years : 21
Voting registration eligible
 
 
Enter your Age in years : 17
Ghar Jao Chupchap

 
 * */
 