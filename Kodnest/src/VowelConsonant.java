// Write a program to accept a character and find out whether it is vowel or a consonant.
import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character ");
		char ch = sc.next().charAt(0);
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
			System.out.println(ch + " is a vowel ");
			return;
		}else {
			System.out.println(ch +" is a consonant ");
		}
		sc.close();
	}
}
