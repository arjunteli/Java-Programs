package com.kn.NestedIf;

import java.util.Scanner;

public class LoanApproval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter Your Age : ");//age
		int age = sc.nextInt();
		System.out.print("Enter your annual income : ");//income
		long income = sc.nextLong();
		loanProcess(age,income);
	}

	static void loanProcess(int age, long income) {
		if(age>=18) {
			if(income >=40000) {
				System.out.println("Loan Approved");
			}
		}
	}

}


/* 
Enter Your Age : 22
Enter your annual income : 30000

Enter Your Age : 22
Enter your annual income : 50000
Loan Approved


*/