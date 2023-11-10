package com.kn.switchCase;

import java.util.Scanner;

public class SolarSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Planet's name (Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune) : ");
		String name = sc.next();
		planetPosition(name);
		sc.close();
		
	}

	static void planetPosition(String name) {
		String planet = name.toLowerCase();
		switch (planet) {
		case "mercury" : System.out.println("Position of "+ name + " from Sun is 1 ");
		break;
		case "venus" : System.out.println("Position of "+ name + " from Sun is 2 ");
		break;
		case "earth" : System.out.println("Position of "+ name + " from Sun is 3 ");
		break;
		case "mars" : System.out.println("Position of "+ name + " from Sun is 4 ");
		break;
		case "jupiter" : System.out.println("Position of "+ name + " from Sun is 5 ");
		break;
		case "saturn" : System.out.println("Position of "+ name + " from Sun is 6 ");
		break;
		case "uranus" : System.out.println("Position of "+ name + " from Sun is 7 ");
		break;
		case "neptune" : System.out.println("Position of "+ name + " from Sun is 8 ");
		break;
		default : System.out.println(name + " does not exist in Solar System");
		}
	}

}


/*
Enter Planet's name (Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune) : Earth
Position of Earth from Sun is 3 

Enter Planet's name (Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune) : Mars
Position of Mars from Sun is 4 

 * */
