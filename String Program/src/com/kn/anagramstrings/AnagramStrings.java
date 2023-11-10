package com.kn.anagramstrings;

import java.util.Arrays;

public class AnagramStrings {
	//Method for anagram
	public boolean isAnagramString(String inputString1, String inputString2) {
		//condition if length are not same
		if(inputString1.length() != inputString2.length()) {
			return false;
		}
		//convert string to char Array
		char[] a = inputString1.toCharArray();
		char[] b = inputString2.toCharArray();
		
		//Sort both Arrays 
		Arrays.sort(a);
		Arrays.sort(b);
		
		//check all the element of both arrays are equal or not
		for(int i = 0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;//return false if different element is found
			}
		}
		
		return true;//when all corresponding elements are equal
	}
	
	//Sorting Method
	public void sortArray(char[] crr) { 
		//Bubble Sort
		for(int i = 0; i<crr.length; i++ ) {
			boolean isSorted = true;
			for(int j = 0; j<crr.length-1-i;j++) {
				
				System.out.println();
				if(crr[j]>crr[j+1]) {//swapping if greater
					char temp = crr[j];
					crr[j] = crr[j+1];
					crr[j+1] = temp;
					isSorted = false; 
				}
				
			}
			if(isSorted) {//if already sorted till here
				return;
			}
			
		}
	}
}
