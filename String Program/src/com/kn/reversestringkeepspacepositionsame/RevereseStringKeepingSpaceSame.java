package com.kn.reversestringkeepspacepositionsame;

public class RevereseStringKeepingSpaceSame {
	public String revereseStringKeepingSpaceSame(String inputString) {
		
		//StringBuffer for Reverse String Without Space
		StringBuffer sb = new StringBuffer();
		for(int i = inputString.length()-1; i>=0; i--) {
			if( inputString.charAt(i) == ' ') {
				continue;
			}
			sb.append( inputString.charAt(i) );
		}
		 
		//Return StringBuffer which is empty currently
		StringBuffer sb2 = new StringBuffer();
		//Count for Spaces
		int count = 0;
		
		for(int i = 0;i<inputString.length(); i++) {
			
			
			if( inputString.charAt(i) == ' ') {//Condition for Space Add
				sb2.append(' ');
				count++;
			}else {
				sb2.append(sb.charAt(i-count));//adding sb string characters to sb2
			}
			
		}
		
		
		return sb2.toString();
	
	}
	
	
	
	
	
	
	
	
	
	public String revereseStringKeepingSpaceSame2(String inputString) {
		
		char[] crr = inputString.toCharArray();
		
		char[] rrr = new char[inputString.length()];
		for(int i = 0; i<crr.length; i++) {
			if(crr[i]== ' ') {
				rrr[i] = crr[i];
			}	
		}
		
		int j = crr.length-1;
		for(int i = 0;i<rrr.length;i++) {
			if(crr[i]==' ') {
				if(rrr[j] == ' ') {
					j--;
				}
				rrr[j]= crr[i];
				j--;
			}
		}
		
		
		
		return new String(rrr);
	}

}
