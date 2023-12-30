package com.kn.removeduplicates;

import com.kn.countnumberofcharacters.CountNumberOfCharacters;

public class RemoveDuplicates {
	public String removeDuplicate(String inputString) {
		StringBuffer unique = new StringBuffer();
		// Object Creation
		CountNumberOfCharacters countObj = new CountNumberOfCharacters();

		for (int i = 0; i < inputString.length(); i++) {
			if (countObj.countNumberOfCharacters(inputString, inputString.charAt(i)) == 0
					|| countObj.countNumberOfCharacters(inputString, inputString.charAt(i)) == 1) {
				unique = unique.append(inputString.charAt(i));
			}
		}

		return unique.toString(); 
	}

}
