package com.kn.patternProblem;

public class Triangle {

	public static void main(String[] args) {
		triangle();
	}

	static void triangle() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
			
				System.out.print("* ");
				if(i<=j) {
					break;
				}
			}
			System.out.println();
		}	
	}

}
/*
 
 
 
* 
* * 
* * * 
* * * * 
* * * * * 

*/
