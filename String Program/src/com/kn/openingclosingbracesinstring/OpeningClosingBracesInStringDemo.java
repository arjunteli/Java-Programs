package com.kn.openingclosingbracesinstring;

import java.util.Scanner;

class OpeningClosingBracesInStringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//User Input
		System.out.println("Enter String = ");
		String str = sc.nextLine();
		
		//Object Creation
		OpeningClosingBracesInString object = new OpeningClosingBracesInString();
		if(object.isValidBraces(str)) {
			System.out.println("Given String is Valid String.");
		}else {
			System.out.println("Given String is not Valid String.");
		}
		
		
		//Close Resources
		sc.close();
	}

}
