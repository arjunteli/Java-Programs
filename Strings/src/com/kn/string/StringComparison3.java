package com.kn.string;

public class StringComparison3 {

	public static void main(String[] args) {
	
		String s3 = "Ram";
		String s4 = s3; 
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
