package com.kn.changecaseofstring;

public class ChangeCaseOfString {
	public String changeCases(String inputString) {
		StringBuffer sb = new StringBuffer();
		
		
		for(int i = 0; i<inputString.length(); i++) {
			int unicode = (int)inputString.charAt(i);
			if(unicode >= 65 && unicode <=90){
				sb = sb.append((char)(unicode + 32));
			}else if(unicode >= 97 && unicode <=122){
				sb = sb.append((char)(unicode - 32));
			}else {
				sb = sb.append((char)(unicode));
			}
		}
		
			
		return sb.toString();
	}
}
