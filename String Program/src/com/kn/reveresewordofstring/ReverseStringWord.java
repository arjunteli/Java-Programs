package com.kn.reveresewordofstring;

public class ReverseStringWord {
	public String reverseStringWord(String inputString) {
		String arr [] = inputString.split(" ");
		String reverseString = ""; 
		for(int i =0; i<arr.length; i++) {
			reverseString +=(reverseString(arr[i]) + " ");
			System.out.println(reverseString(arr[i]));
		}
		
		return reverseString;
	}
	
	
	//Method to reverse String
	public String reverseString(String inputString) {
		StringBuffer output = new StringBuffer();
		for(int i = inputString.length()-1; i>= 0; i--) {
			output = output.append(inputString.charAt(i));   
		}
		return output.toString();
	}
}
