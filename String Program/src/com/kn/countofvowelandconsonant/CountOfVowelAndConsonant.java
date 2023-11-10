package com.kn.countofvowelandconsonant;

public class CountOfVowelAndConsonant {

	public void printCountOfVowelAndConsonant(String inputString) {
		int upperVowel=0;
		int upperConsonant=0;
		int lowerVowel=0;
		int lowerConsonant=0;
		int digit = 0;
		int specialCharacter=0;
		int space = 0;
		for(int i = 0;i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if( Character.isUpperCase(ch)){
				if(ch=='A' || ch =='E' || ch=='I' || ch=='O'|| ch=='U') {
					upperVowel++;
				}else {
					upperConsonant++;
				}
			}else if(Character.isLowerCase(ch)) {
				if(ch=='a' || ch =='e' || ch=='i' || ch=='o'|| ch=='u'){
					lowerVowel++;
				}else {
					lowerConsonant++;
				}
			}else if(ch ==' '){
				space++;
			}else if ((int)ch>=48 && (int)ch<=57) {
				digit++;
			}else {
				specialCharacter++;
			}
		}
		
		System.out.println("UpperCase  ");
		System.out.println("      Vowel = "+upperVowel);
		System.out.println("      Consonant = "+upperConsonant);
		
		System.out.println("LowerCase  ");
		System.out.println("      Vowel = "+lowerVowel);
		System.out.println("      Consonant = "+lowerConsonant);
		
		System.out.println("Digit = "+ digit);
		System.out.println("Space = "+ space);
		System.out.println("Special Characters = "+specialCharacter);
		
	}

}
