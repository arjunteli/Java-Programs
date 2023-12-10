package com.kn.counteachcharactersinstring;

import java.util.Scanner;

public class CountOfEachCharacterInStringDemo {

	public static void main(String[] args) {
		//Input String from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String = ");
		String inputString = sc.nextLine();
		
		//Object Creation
		CountOfEachCharacterInString object = new CountOfEachCharacterInString();
		
		//Method Calling
		object.printCountOfEachCharacterInString(inputString);
		
		//Release Resources
		sc.close();
		
	}

}
