package com.kn.switchCase;

import java.util.Scanner;

public class BonusEligibilityScheme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of year service : ");
		int exp = sc.nextInt();
		System.out.print("Enter the number of monthly target met : ");
		int target = sc.nextInt();
		bonusEligibility(exp,target);
	}

	static void bonusEligibility(int exp, int target) {
		switch (exp) {
		case 0 : System.out.println("Not ELigible");
		break;
		case 1 : System.out.println("Not ELigible");
		break;
		case 2 : System.out.println("Not ELigible");
		break;
		case 3 : System.out.println("Not ELigible");
		break;
		default : if(target>6) {
			System.out.println("Bonus Eligible");
		}
		
		
		}
	}
}

/*
Enter total number of year service : 4
Enter the number of monthly target met : 7
Bonus Eligible

Enter total number of year service : 3
Enter the number of monthly target met : 6
Not ELigible

 * */
