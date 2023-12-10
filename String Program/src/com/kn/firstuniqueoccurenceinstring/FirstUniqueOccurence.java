package com.kn.firstuniqueoccurenceinstring;

public class FirstUniqueOccurence {

	public char firstUniqueOccurence(String inputString) {
		boolean bl = true;
		
		for(int i = 0; i<inputString.length(); i++) {
			bl = true;
			for(int j = 0; j<inputString.length() && bl; j++) {
				if(i != j) {
					if(inputString.charAt(i)==inputString.charAt(j)) {
						bl = false;
					}
				}
			}
			if(bl) {
				return inputString.charAt(i);
			}
		}
		
		return ' ';
	}

}
