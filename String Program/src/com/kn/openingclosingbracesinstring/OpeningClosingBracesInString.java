package com.kn.openingclosingbracesinstring;

public class OpeningClosingBracesInString {

	public boolean isValidBraces(String str) {
		int paranthesis = 0, curly = 0, square = 0;
		for(int i = 0; i<str.length(); i++) { 
			if(str.charAt(i)=='{') {
				curly++;
			}else if(str.charAt(i)=='}') {
				curly--;
			}else if(str.charAt(i)=='[') {
				square++;
			}else if(str.charAt(i)==']') {
				square--;
			}else if(str.charAt(i)=='(') {
				paranthesis++;
			}else if(str.charAt(i)==')') {
				paranthesis--;
			}else {
				
			}
		}
		return paranthesis ==0 && curly==0 && square==0;
	}
	
}
