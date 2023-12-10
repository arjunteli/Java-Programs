package com.kn.longestwordinstring;

public class LongestWordInString {
	public String longestWordInString(String inputString) {
		String arr [] = inputString.split(" ");
		//int count = arr[0].length();
		StringBuffer longest = new StringBuffer(arr[0]);
		for(int i = 0; i <arr.length; i++) {
			if(longest.length() < arr[i].length()) {
				longest = new StringBuffer(arr[i]);
				
			}
		}
		return longest.toString();
	}
}
