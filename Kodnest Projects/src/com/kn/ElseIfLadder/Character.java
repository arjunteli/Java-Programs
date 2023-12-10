package com.kn.ElseIfLadder;

import java.util.Scanner;

public class Character {
	
	static void check(int n) {
		if(n==97||n==101||n==105||n==111||n==117) {
			System.out.println("Lower Case Vowel");
			return;
		}else if(n==65||n==69||n==73||n==79||n==85) {
			System.out.println("Upper Case Vowel");
			return;
		}else if(n>=48 && n<=57) {
			System.out.println("DIGIT");
			return;
		}else if(n>=65 && n<=90 ) {
			System.out.println("Upper Case Consonant");
			return;
		}else if(n>=97 && n<=122) {
			System.out.println("Lower Case Consonant");
			return;
		}else {
			System.out.println("Special Character");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character = ");
		char ch = sc.nextLine().charAt(1);
		int n = ch;     
		check(n);
		}

	

}



/*
Enter Character = a
Lower Case Vowel

Enter Character = $
Special Character


*/
