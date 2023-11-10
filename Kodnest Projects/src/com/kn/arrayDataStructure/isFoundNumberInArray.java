package com.kn.arrayDataStructure;

import java.util.Scanner;

public class isFoundNumberInArray {

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
		System.out.println("Enter the number to check is there in Array or Not : ");
		int num = sc.nextInt();		
		//Method call
		boolean bl = isFound(arr,num);
		System.out.println("The Number "+ num + " is found in Array = "+ bl);		
		sc.close();

	}

	static boolean isFound(int[] arr, int num) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==num) return true;
		}
		return false;
	}

}
