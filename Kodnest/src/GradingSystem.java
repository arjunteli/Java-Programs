//4. WAP to take marks as an input from the user and if 
//makrks>=90 -->A Grade
//marks 75-90 B Grade
//marks 60-75 C grade
//marks 45-60 D Grade
//marks <35-45 E grade
//<35 next attempt

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		System.out.println("Enter your score ");
		Scanner sc = new Scanner(System.in);
		int scr = sc.nextInt();
		if(scr >= 90) {
			System.out.println("A Grade");
		}
		else if(scr < 90 && scr>=75) {
			System.out.println("B Grade");
		}
		else if(scr < 75 && scr>=60) {
			System.out.println("C Grade");
		}else if(scr < 60 && scr>=45) {
			System.out.println("D Grade");
		}else if(scr < 45 && scr>=35) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("Please apply for next attempt");
		}
		sc.close();
	}
}
