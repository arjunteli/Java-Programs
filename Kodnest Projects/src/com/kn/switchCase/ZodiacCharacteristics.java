package com.kn.switchCase;

import java.util.Scanner;

public class ZodiacCharacteristics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Zodiac's sign (Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces ) : ");
		String name = sc.next();
		zodiacCharacteristic(name);
		sc.close();
	}

	static void zodiacCharacteristic(String name) {
		String raashi = name.toLowerCase();
		switch (raashi) {
		case "aries" : System.out.println(name + " characteriestic is "+ "Adventurous");
		break;
		case "taurus" : System.out.println(name + " characteriestic is "+ "Dependable");
		break;
		case "gemini" : System.out.println(name + " characteriestic is "+ "Expressive");
		break;
		case "cancer" : System.out.println(name + " characteriestic is "+ "Intuitive");
		break;
		case "leo" : System.out.println(name + " characteriestic is "+ "Passionate");
		break;
		case "virgo" : System.out.println(name + " characteriestic is "+ "Analytical");
		break;
		case "libra" : System.out.println(name + " characteriestic is "+ "Diplomatic");
		break;
		case "scorpio" : System.out.println(name + " characteriestic is "+ "Determined");
		break;
		case "sagittarius" : System.out.println(name + " characteriestic is "+ "Philosophical");
		break;
		case "capricorn" : System.out.println(name + " characteriestic is "+ "Organized");
		break;
		case "aquarius" : System.out.println(name + " characteriestic is "+ "Original");
		break;
		case "pisces" : System.out.println(name + " characteriestic is "+ "Compassionate");
		break;
		}
	}

}
/*
Enter Zodiac's sign (Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces ) : Aries
Aries characteriestic is Adventurous

Enter Zodiac's sign (Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces ) : virgo
virgo characteriestic is Analytical

 * */
 