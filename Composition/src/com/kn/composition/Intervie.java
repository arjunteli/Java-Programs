package com.kn.composition;

public class Intervie  {
	public static void main(String[] args) {
		int[] arr = {1,0,1,1,1,0,0,1,1,0};
	
		int countZero = 0;
		for(int element : arr) {
			countZero += element;
		}
		System.out.println("Total number of Zeroes = "+ (arr.length-countZero));
		
		
		System.out.println("Total number of Ones = "+ countZero);
	}
}
