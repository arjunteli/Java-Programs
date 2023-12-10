package com.kn.countnumberofcharacters;

import java.util.Scanner;

public class CountNumberOfCharactersDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//take input from user
		System.out.print("Enter string = ");
		String inputString = sc.nextLine();
		System.out.print("Enter character = ");
		char character = sc.next().charAt(0);
		//Object Creation
		CountNumberOfCharacters count =new  CountNumberOfCharacters();
		//method call
		System.out.println("Total Number of "+ character + " in "+ inputString+ " = "+count.countNumberOfCharacters(inputString, character)); 
		//Release resources
		sc.close();
		
	}

}
