import java.util.Scanner;

public class VIBGYOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter chracter : ");
		char ch = sc.nextLine().charAt(0);
		
//		if(ch == 'v'||ch=='V') {
//			System.out.println("Rainbow Color");
//		}else if (ch == 'i'||ch=='I') {
//			System.out.println("Rainbow Color");
//		}else if (ch == 'b'||ch=='B') {
//			System.out.println("Rainbow Color");
//		}else if (ch == 'g'||ch=='G') {
//			System.out.println("Rainbow Color");
//		}else if (ch == 'y'||ch=='Y') {
//			System.out.println("Rainbow Color");
//		}else if (ch == 'o'||ch=='O') {
//			System.out.println("Rainbow Color");
//		}else if (ch == 'r'||ch=='R') {
//			System.out.println("Rainbow Color");
//		}else {
//			System.out.println("Not a Rainbow Color");
//		}
		
		switch (ch) {
		case 'v': 
				System.out.println("Voilet Color");
				break;
		case 'i':
				System.out.println("Indigo Color");
				break;
		case 'b':
				System.out.println("Blue Color");
				break;
		case 'g':
				System.out.println("Green Color");
				break;		
		case 'y':
				System.out.println("Indigo Color");
				break;
		}
		
		sc.close();
	}
	
}
