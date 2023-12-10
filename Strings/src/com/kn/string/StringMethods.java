package com.kn.string;

public class StringMethods {

	public static void main(String[] args) {
		String s = "   Ragupathi Ragav Raja Ram";
		
		//String length
		System.out.println("Length of the String = "+ s.length());
		
		//To check string start with given string or not
		System.out.println(s.startsWith("kj"));
		
		//To check string ends with given string or not
		System.out.println(s.endsWith("jh"));
		
		//To convert string to Character Array
		char [] ch = s.toCharArray();
		//print array 
		printArray(ch);
		//trim method- to remove initial and ending spaces
		System.out.println(s.trim());
		
		//spilt method
		System.out.println(s.split(s));

	}
	static void printArray(char[]arr) {
		for(int i = 0; i<arr.length; i++ ) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
