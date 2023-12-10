package com.kn.countofvowelandconsonant;

import java.util.Scanner;

public class CountOfVowelAndConsonantDemo {

	public static void main(String[] args) {
		//Input from User 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String = ");
		String inputString = sc.nextLine();
		
		//Object Creation
		CountOfVowelAndConsonant object = new CountOfVowelAndConsonant();
		
		//Method Calling
		object.printCountOfVowelAndConsonant(inputString);
	}

}
