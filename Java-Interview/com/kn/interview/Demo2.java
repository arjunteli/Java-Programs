package kn.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input 1 = ");
		String str = sc.nextLine();
		str = str.replace(".", "");
		str = str.replace(",", "");
		str = str.replace(";", "");
		str = str.replaceAll("[0-9]", "");
		str = str.replaceAll("[!@#$%^&********()+=_-]", "");
		for(int i = 0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				
		}
		// String str = "This is a paragraph. It contains words, and sentences, and
		// separators. This paragraph has words and it contains three sentences.";
		
		//str = newStr(str);
		System.out.println("Enter Input 2 = ");
		int num = sc.nextInt();
		switch (num) {
		case 0: {
			occurance0(str);
			break;
		}
		case 1: {
			occurance1(str);
			break;
		}
		default:
			System.err.println("Enter proper input for input 2");
		}
		sc.close();
	}

	private static void occurance1(String str) {
		str = str.toLowerCase();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String s : str.split(" ")) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		// Creations and adding objects in list
		List<ObjectClass> list = new ArrayList<ObjectClass>();
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			ObjectClass obj = new ObjectClass(e.getKey(), e.getValue());
			list.add(obj);
		}

		// Sorting list basis on count
		Collections.sort(list);
		for (ObjectClass obj : list) {
			//if(obj.key!=null && obj.key.charAt(0)!=' ') {
			System.out.println(obj.key + " \t\t" + obj.count);}
		//}

	}

	private static void occurance0(String str) {
		str = str.toLowerCase();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String s : str.split(" ")) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			
				System.out.print(e.getKey() + "\t");
				System.out.println("\t" + e.getValue());	
			}
			}
		
	}
	

}
