package com.kn.arrayDataStructure;

import java.util.Scanner;

public class IntroArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of String Array : ");
		//Array Declaration
		String[] arr;
		
		//Array Creation
		arr = new String[sc.nextInt()];
		//sc.nextLine();
		//Array Initialization
		
		for(int i = arr.length-1; i >=0; i--) {
			System.out.print("Enter "+(i+1)+" String Data : ");
			arr[i] = sc.next();
			
		}
		
		//Array Traversing
		System.out.println("Array of String Data is follow as : ");
		for(int i = arr.length-1; i > -1; i--) {
			System.out.println( (i+1)+" Data is  "+arr[i]);
		}
		
		
	}

}
