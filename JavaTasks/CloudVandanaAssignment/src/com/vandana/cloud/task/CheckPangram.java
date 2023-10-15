package com.vandana.cloud.task;

import java.util.Scanner;

import com.vandana.cloud.task.exception.NotAPangramException;
import com.vandana.cloud.task.utill.PangramHelper;

public class CheckPangram {

	public static Scanner scan=new Scanner(System.in);

	
	
	public static void main(String[] args) throws NotAPangramException {
		System.out.println("Enter text to check Pangram: ");
		String text=scan.nextLine();
		try {
			try {
				if(text.isEmpty() || text==null) {
					throw new IllegalArgumentException("It should not be empty or null");
				}
			}catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());
			}
			
			String removeSpace=PangramHelper.removeSpace(text);
			int  result=PangramHelper.check(removeSpace);
			
			if(result==1) {
			System.out.println("given text: "+text+" is pangram");
			}else {
				System.err.println("not pangram");
			}
			
		}catch(NotAPangramException e) {
			throw new NotAPangramException("Text: "+text+" is not pangram");
		}
		scan.close();
	}
}
