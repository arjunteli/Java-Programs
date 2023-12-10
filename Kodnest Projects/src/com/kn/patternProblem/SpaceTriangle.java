package com.kn.patternProblem;

public class SpaceTriangle {

	public static void main(String[] args) {
		spaceTriangle();
	}

	static void spaceTriangle() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i+j>=4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
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
