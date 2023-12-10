package com.kn.removeduplicates;

public class CountNumberOfCharacters {
	public int countNumberOfCharacters(String inputString, char character) {
		char [] ch = inputString.toCharArray();
		int count =0;
		for(int i =0; i<inputString.length(); i++) {
			if(ch[i]== character) {
				count++;
			}
		}
		return count;
	}
}
