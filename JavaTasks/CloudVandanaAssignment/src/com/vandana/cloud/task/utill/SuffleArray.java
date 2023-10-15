package com.vandana.cloud.task.utill;

import java.util.Random;

import com.vandana.cloud.task.exception.SuffleException;

public class SuffleArray {

	public static void suffledArray(int[] data) throws SuffleException {
		if(data==null || data.length==0) {
			throw new SuffleException("Given Array data is empty");
		}
		Random random=new Random();
		for(int i=0;i<data.length;i++) {
			//int randomIndex=(int)(Math.random()*(i+1));
			int randomIndex=random.nextInt(data.length);
			try {
				swapElements(data,randomIndex, i);
			}catch(ArrayIndexOutOfBoundsException e) {
				throw new SuffleException("Array index out of bounds during shuffling");
			}
		}
	}
	
	public static void swapElements(int[] arrayData, int randomIndex, int exIndex) {
		int temp=arrayData[randomIndex];
		arrayData[randomIndex]=arrayData[exIndex];
		arrayData[exIndex]=temp;
	}
}
