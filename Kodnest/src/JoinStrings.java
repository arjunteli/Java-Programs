
import java.util.Scanner;

public class JoinStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter both strings ");
		System.out.println("Concatanation of strings is "+ joinString(sc.nextLine(), sc.nextLine()));
		sc.close();
	}
	public static String joinString(String str1,String str2) {
		return str1 + str2;
	}
}
