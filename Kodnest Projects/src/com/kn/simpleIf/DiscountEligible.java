package com.kn.simpleIf;

import java.util.Scanner;

public class DiscountEligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase item cost : ");
		double cost = sc.nextFloat();
		sc.close();
		isApplicable(cost);
	}

	static void isApplicable(double cost) {
		if(cost>200) {
			System.out.println("Discount of 20 % applicable");
		}else {
			System.out.println("Please purchase more 200$ for discount");
		}
	}

}


/*

Enter total purchase item cost : 220
Discount of 20 % applicable

Enter total purchase item cost : 180
Please purchase more 200$ for discount

 * */
 