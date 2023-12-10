package com.kn.arrayDataStructure;

import java.util.Scanner;

public class ABatchFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array Declaration
		String[][] arr;
		System.out.print("Enter Total Number Of Batch in your Coaching = ");
		
		//Array Creation & Initialization
		arr = new String[sc.nextInt()][];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter Total number of friends in batch A" + (i+1)+ " = ");
			
			arr[i] = new String[sc.nextInt()];
			sc.nextLine();
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("Enter name of "+ (j+1)+" friend = ");
				arr[i][j] = sc.nextLine();
			}
		}
		System.out.println("======================");
		System.out.println("======================");
		System.out.println();
		//Array Traversing
		for( int i = 0; i<arr.length ; i++ ) {
			System.out.println("Batch A" + (i+1) + " = ");
			System.out.println("Names of friends are follows as = ");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print((j+1) +". ");
				System.err.println( arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
