import java.util.Scanner;

public class LeapYear {
	public static boolean leap(int year) {
		boolean leap = false;
		
		if(year %4 == 0) {
			if(year%100==0) {
				if(year%400==0) {
					leap = true;
				}
			}else {
				leap = true;
			}
			
		}
		
		return leap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Year : ");
			int year = sc.nextInt();
			boolean bl = leap(year);
			if(bl) {
				System.out.println("Leap Year");
			}else {
				System.out.println("Not a Leap Year");
			}
	}

}
