package kn.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		occur("mississippi");
	}

	public static void occur(String str) {
		str = str.toLowerCase();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		for (int i = 65; i < 123; i++) {
//			int occur = countOccurence(str, (char) i);
//			if (occur != 0) {
//				System.out.println(((char) (i)) + " = " + occur);
//			}
//
//		}
//	}
//
//	private static int countOccurence(String str, char i) {
//		int count = 0;
//		// str = str.toLowerCase();
//		for (char ch : str.toCharArray()) {
//			if (ch == i) {
//				count++;
//			}
//		}
//		return count;
//	}

}
