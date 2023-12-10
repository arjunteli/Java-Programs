package com.kn.NestedIf;

import java.util.Scanner;

public class RecruitmentAgency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Experience in Years : ");
		int exp = sc.nextInt();
		System.out.print("Enter Skill Level : ");
		int skill = sc.nextInt();
		isSuitableCandidate(exp,skill);
	}

	static void isSuitableCandidate(int exp, int skill) {
		if(exp>5) {
			if(skill>7) {
				System.out.println("Suitable Candidate");
			}
		}
	}

}

/* 
Enter Your Experience in Years : 6
Enter Skill Level : 8
Suitable Candidate

Enter Your Experience in Years : 5
Enter Skill Level : 6

 
 */
