package com.kn.ceasercipher;

public class CeaserCipher {

	public String ceaserCipherString(String inputString, int num) {
		StringBuffer result= new StringBuffer();

		for (int i=0; i<inputString.length(); i++)
		{
			if (inputString.charAt(i)<=90 && inputString.charAt(i)>=65)
			{
				char character = (char)(((int)inputString.charAt(i) + num - 65) % 26 + 65);
				result.append(character);
			} 
			else
			{
				char character = (char)(((int)inputString.charAt(i) + num - 97) % 26 + 97);
				result.append(character);
			}
		}
		return result.toString();
	}
}
