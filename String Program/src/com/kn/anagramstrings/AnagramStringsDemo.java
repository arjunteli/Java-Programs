package com.kn.anagramstrings;

import java.util.Scanner;

public class AnagramStringsDemo {

	public static void main(String[] args) {
		
		//Use External Resources 
		Scanner sc = new Scanner(System.in);
		
		//take input from user
		//String 1
		System.out.println("Enter String 1 = ");
		String inputString1 = sc.nextLine();
		//String 2
		System.out.println("Enter String 2 = ");
		String inputString2 = sc.nextLine();
		
		//Object Creation
		AnagramStrings anagram = new AnagramStrings();
		
		//method call
		boolean isAnagram = anagram.isAnagramString(inputString1, inputString2);
		
		//Print Part
		if(isAnagram) {
			System.out.println(inputString1+" and "+ inputString2+ " are Anagram.");
		}else {
			System.out.println(inputString1+" and "+ inputString2+ " are NOT Anagram.");
		}
		
		//Release external resources
		sc.close();
		
	}

}
