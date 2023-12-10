package com.kn.arrayDataStructure;

import java.util.Scanner;

public class PositiveNumberCountInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array Declaration & Creation
		System.out.print("Enter the size of Array : ");
		int size =sc.nextInt();
		int[] arr = new int[size];
		
		//Initialization
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Call method to find total count of positive numbers
		int count = countPositiveNumber(arr);
		
		System.out.println("Total Number of Positive Numbers in Array = "+ count);		
		sc.close();

	}
	//method to find total count of positive numbers
	static int countPositiveNumber(int[] arr) {
		 int count = 0;
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i]>0) {
				count++; 
			 }
		 }
		 return count;
	}

}
