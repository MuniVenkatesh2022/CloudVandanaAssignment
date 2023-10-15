package com.vandana.cloud.task;

import java.util.Scanner;

import com.vandana.cloud.task.exception.InvalidRomanNumeralException;
import com.vandana.cloud.task.utill.RomanToIntegerConverts;

public class RomanToInteger {

	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws InvalidRomanNumeralException {
		
		System.out.println("Enter Roman Numeral: ");
		String romanNumeral=scan.nextLine().toUpperCase();
		try {
			int result=RomanToIntegerConverts.romanToInteger(romanNumeral);
			System.out.println("The Integer Equivalent of "+ romanNumeral + " is: "+result);
		}catch(Exception e) {
			throw new InvalidRomanNumeralException("Invalid Roman numeral:"+ e.getMessage());
		}
		scan.close();
	}
}
