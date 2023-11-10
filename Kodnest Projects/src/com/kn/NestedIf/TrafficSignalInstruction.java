package com.kn.NestedIf;

import java.util.Scanner;

public class TrafficSignalInstruction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Traffic color : ");
		String str = sc.next();
		signal(str);
		
		
		sc.close();
	}

	static void signal(String str) {
		if(str.equalsIgnoreCase("Red")) {
			System.out.println("STOP");
		}else if(str.equalsIgnoreCase("Yellow")) {
			System.out.println("Ready");
		}else if(str.equalsIgnoreCase("Green")) {
			System.out.println("GO");
		}else {
			System.out.println("INVALID COLOR");
		}
	}

}
/* 
Enter Traffic color : REd Color
STOP

Enter Traffic color : green
GO

 *  */
