package com.kn.firstuniqueoccurenceinstring;

import java.util.Scanner;

public class FirstUniqueOccurenceDemo {

	public static void main(String[] args) {
		//Input From User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String = ");
		String inputString = sc.nextLine();
		//Object Creation
		FirstUniqueOccurence object = new FirstUniqueOccurence();
		
		//Method Calling
		
		System.out.println("First Unique Occurence = "+ object.firstUniqueOccurence(inputString));
		
	}

}
