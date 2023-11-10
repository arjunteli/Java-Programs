package com.kn.arrayDataStructure;

import java.util.Scanner;

public class EvenNumbersInArray {

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
		printEvenNumbers(arr);
		sc.close();
	}

	public static void printEvenNumbers(int[] arr) {
		System.out.println("Even Numbers In Array are : ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
