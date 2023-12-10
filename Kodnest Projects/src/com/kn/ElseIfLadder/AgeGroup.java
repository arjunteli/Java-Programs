package com.kn.ElseIfLadder;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		ageGroup(age);
		
	}

	static void ageGroup(int age) {
		if(age >=0 && age<=12) {
			System.out.println( "Age of " + age + " years is a child");
		}else if(age>=13 && age<=19) {
			System.out.println( "Age of " + age + " years is a teen");
		}else if(age>=20 && age<=59) {
			System.out.println( "Age of " + age + " years is an adult");
		}else {
			System.out.println( "Age of " + age + " years is a senior citizen");
		}
	}

}




/*
 * Enter your Age : 6
Age of 6 years is a child

Enter your Age : 30
Age of 30 years is an adult


 */
