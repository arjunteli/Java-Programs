package com.kn.switchCase;

import java.util.Scanner;

public class GardeningShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for fertilizers :\n1 for Roses\n2 for Sunflowers\n3 for Orchids\n4 for Cacti\n5 for Ferns \n---------:");
		int n = sc.nextInt();
		printPlantName(n);
		sc.close();
	}

	public static void printPlantName(int n) {
		switch (n) {
		case 1 : System.out.println("Roses - Rose Food"); 
		break;
		case 2 : System.out.println("Sunflowers - All Purpose Fertilizer"); 
		break;
		case 3 : System.out.println("Orchids - Orchid Fertilizer"); 
		break;
		case 4 : System.out.println("Cacti - Cactus Mix"); 
		break;
		case 5 : System.out.println("Ferns - Organic Compost"); 
		break;
		default : System.out.println("Wrong Number entered");
		}
	}

}

/*
 Enter number for fertilizers :
1 for Roses
2 for Sunflowers
3 for Orchids
4 for Cacti
5 for Ferns 
---------:
1
Roses - Rose Food

Enter number for fertilizers :
1 for Roses
2 for Sunflowers
3 for Orchids
4 for Cacti
5 for Ferns 
---------:
4
Cacti - Cactus Mix


 * */
