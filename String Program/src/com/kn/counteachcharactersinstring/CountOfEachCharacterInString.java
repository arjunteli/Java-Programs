package com.kn.counteachcharactersinstring;

import java.util.Arrays;

public class CountOfEachCharacterInString {

	public void printCountOfEachCharacterInString(String inputString) {
		
		//initializing counter variable
		int count = 1;
		char[] crr = inputString.toCharArray();//converting String to char Array
		sortArray(crr);
		for(int i = 0; i<inputString.length()-1; i++) {
			if(crr[i]==crr[i+1]) {
				count++;
				if(i==crr.length-2) {
					System.out.println(crr[i]+" = "+count);
				}
			}else {
				System.out.println(crr[i]+" = "+count);
				count = 1;
				if(i==crr.length-2) {
					System.out.println(crr[i+1]+" = "+count);
				}
			}
		}
	}
	//Sorting Method
	public void sortArray(char[] crr) { 
		//Bubble Sort
		for(int i = 0; i<crr.length; i++ ) {
			boolean isSorted = true;
			for(int j = 0; j<crr.length-1-i;j++) {
				
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
