package com.kn.arrayDataStructure;

import java.util.Scanner;

public class ManufacturerCars {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				//Array Declaration
				String[][] arr;
				System.out.print("Enter Total Number Of Manufacturer = ");
				
				//Array Creation & Initialization
				
				arr = new String[sc.nextInt()][];
				String MF[] = new String[arr.length];
				System.out.println("Enter Manufacturer name = ");
				for(int i = 0; i<arr.length;i++) {
					System.out.println((i+1) +".");
					MF[i] = sc.next();
				}
				System.out.println("--------------------<>------------------");
				for(int i = 0; i < arr.length; i++) {
					System.out.print("Enter Total number of Models in "+ MF[i]+ " = ");
					
					arr[i] = new String[sc.nextInt()];
					sc.nextLine();
					for(int j = 0; j<arr[i].length; j++) {
						System.out.println("Enter name of "+ (j+1)+" Model = ");
						arr[i][j] = sc.nextLine();
					}
				}
				System.out.println("======================");
				System.out.println("======================");
				System.out.println();
				//Array Traversing
				for( int i = 0; i<arr.length ; i++ ) {
					System.out.println((i+1)+". "+ MF[i] + " Models are as Follows = ");
					System.out.println();
					for(int j = 0; j < arr[i].length; j++) {
						System.out.print(  "   "+(j+1) +". ");
						System.out.println( arr[i][j]);
					}
					System.out.println();
				}
				sc.close();
	}

}




/* 

Enter Total Number Of Manufacturer = 5
Enter Manufacturer name = 
1.
TATA
2.
MAHINDRA
3.
BMW
4.
TOYOTA
5.
AUDI
--------------------<>------------------
Enter Total number of Models in TATA = 3
Enter name of 1 Model = 
Altroz
Enter name of 2 Model = 
Safari
Enter name of 3 Model = 
Nexon
Enter Total number of Models in MAHINDRA = 4
Enter name of 1 Model = 
Bolero
Enter name of 2 Model = 
XUV500
Enter name of 3 Model = 
Scorpio
Enter name of 4 Model = 
Thar
Enter Total number of Models in BMW = 2
Enter name of 1 Model = 
GT
Enter name of 2 Model = 
520d
Enter Total number of Models in TOYOTA = 3
Enter name of 1 Model = 
Yaris
Enter name of 2 Model = 
Fortuner
Enter name of 3 Model = 
Innova
Enter Total number of Models in AUDI = 2
Enter name of 1 Model = 
A6
Enter name of 2 Model = 
Q7
======================
======================

1. TATA Models are as Follows = 

   1. Altroz
   2. Safari
   3. Nexon

2. MAHINDRA Models are as Follows = 

   1. Bolero
   2. XUV500
   3. Scorpio
   4. Thar

3. BMW Models are as Follows = 

   1. GT
   2. 520d

4. TOYOTA Models are as Follows = 

   1. Yaris
   2. Fortuner
   3. Innova

5. AUDI Models are as Follows = 

   1. A6
   2. Q7

*/


