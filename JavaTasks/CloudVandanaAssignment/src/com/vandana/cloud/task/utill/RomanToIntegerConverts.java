package com.vandana.cloud.task.utill;

public class RomanToIntegerConverts {

	public static int romanToInteger(String romanInput) {
		int result=0;
		if(romanInput.isEmpty()) {
			return 0;
		}
		for(int i=0; i<romanInput.length();i++) {
			char currentChar=romanInput.charAt(i);
			char nextChar=(i<romanInput.length()-1)?romanInput.charAt(i+1):' ';
			
			int currentCharValue=romanValues(currentChar);
			int nextCharValue=romanValues(nextChar);
			
			if(currentCharValue<nextCharValue) {
				result-=currentCharValue;
			}else {
				result+=currentCharValue;
			}
			
		}
		return result;
	}
	
	public static int romanValues(char romanChar) {
		switch(romanChar){
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		default:
			return 0;
		}
	}
}
