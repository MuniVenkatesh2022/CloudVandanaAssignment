package com.vandana.cloud.task.utill;

import com.vandana.cloud.task.exception.NotAPangramException;

public class PangramHelper {

	public static String removeSpace(String input) {
		char[] charArray=input.toCharArray();
		String charToString="";
		
		for(int i=0;i<charArray.length;i++) {
			if(Character.isDigit(charArray[i])) {
				System.err.println("Give Text: "+ input +" has number");
				break;
			}
			if(charArray[i]!=' ') {
				charToString+=charArray[i];
			}
		}
		return charToString;
	}
	
	public static int check(String text) throws NotAPangramException {
		int size=26;
		
		if(text.length()<size) {
			return -1;
		}
		for(char i='A';i<='Z';i++) {
			if((text.indexOf(i)<0)&&(text.indexOf((char)(i+32))<0)) {
				throw new NotAPangramException("The give input is not a pangram");
			}
		}
		return 1;
	}
}
