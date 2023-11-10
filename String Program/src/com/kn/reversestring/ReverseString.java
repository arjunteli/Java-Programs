package com.kn.reversestring;
public class ReverseString {
	//Method to reverse String
	public String reverseString(String inputString) {
		StringBuffer output = new StringBuffer();
		for(int i = inputString.length()-1; i>= 0; i--) {
			output = output.append(inputString.charAt(i));   
		}
		return output.toString();
	}
}
