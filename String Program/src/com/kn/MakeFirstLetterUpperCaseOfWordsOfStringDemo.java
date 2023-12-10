package com.kn;

import java.util.Scanner;

public class MakeFirstLetterUpperCaseOfWordsOfStringDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//take input from user
		System.out.print("Enter string = ");
		String inputString = sc.nextLine();
		
		//Object Creation
		MakeFirstLetterUpperCaseOfWordsOfString updated = new MakeFirstLetterUpperCaseOfWordsOfString();
		System.out.println("Updated String = "+ updated.makeFirstLetterUpperCaseOfWordsOfString(inputString));
		
		//Release External Resourses
	}

}
