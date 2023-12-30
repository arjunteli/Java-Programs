import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter = ");
		String str = sc.nextLine();

		str = str.replace(",", "");
		str = str.replace(".", "");
		List<String> list = new ArrayList<>();
		String[] arr = str.split(" ");
		for (String s : arr) {
			if (isPalindrome(s, 0, s.length() - 1)) {
				list.add(s);
			}
		}
		System.out.println(list);
		// System.out.println(str + " is Palindrome ? --> " + isPalindrome(str, 0,
		// str.length() - 1));
//		if (isPalindrome(str, 0, str.length() - 1)) {
//			System.out.println("PALINDROME");
//		} else {
//			System.out.println("NOT A PALINDROME");
//		}
	}

	private static boolean isPalindrome(String str, int start, int end) {
//		str = str.toLowerCase();
//		if (start > end) {
//			return true;
//		}
//		if (isPalindrome(str, start + 1, end - 1)) {
//			if (str.charAt(start) != str.charAt(end)) {
//				return false;
//			}
//		} else {
//			return false;
//		}
//		return true;
		str = str.toLowerCase();
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

}
