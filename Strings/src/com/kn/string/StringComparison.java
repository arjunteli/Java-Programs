package com.kn.string;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + s2;//concatenation of reference will create outside of String POOL
		String s4 = s1 + s2;// Duplicate obj will be created outside 
		if(s3 == s4) {
			System.out.println("References are same");
		} else {
			System.out.println("References are different");
		}
		if(s3.equals(s4)) {
			System.out.println("String Data Equal");
		}else {
			System.out.println("String Data Unqual");
		}
		
		
	}

}
