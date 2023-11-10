package com.kn;

public class MakeFirstLetterUpperCaseOfWordsOfString {
	public String makeFirstLetterUpperCaseOfWordsOfString(String inputString) {
		String[] arr = inputString.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<arr.length; i++) {
			char[] crr = arr[i].toCharArray();
			if(crr[0]>=97 && crr[0]<=122) {
				crr[0] = (char)(crr[0]-32);
			}
			arr[i] = new String(crr);
			
		}
		for(String s : arr) {
			sb.append(s+ " ");
			
		}
		return sb.toString();
	}
}
