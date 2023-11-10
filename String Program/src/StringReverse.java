public class StringReverse {
	public static String reverseString(String str ) {
		
		
		//String  
		StringBuffer str2 = new StringBuffer();
		for(int i =str.length()-1;i>=0; i-- ) {
			str2 = str2.append(str.charAt(i));
		}
		return str2.toString();
	}
	
	public static int numberOftimesCharacter(String str, char ch) {
		int count = 0;
		
		char [] arr = str.toCharArray();//converting to char Array
		
		for(int i = 0; i<str.length(); i++) {//forward traversing
			if(arr[i]==ch) {//comparing
				count ++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		String str = new String("hcetofni niarbedoc si siht");
		System.out.println(reverseString(str));
		char ch = 't';
		System.out.println("********************************");
		for(int i = 97 ;i<=122; i++ ) {
			char ch2 = (char)i;
			System.out.println(ch2 +" = "+ numberOftimesCharacter(reverseString(str), ch2));
		}
		
	}

}
