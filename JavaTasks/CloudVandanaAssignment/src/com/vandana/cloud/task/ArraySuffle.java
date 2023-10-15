package com.vandana.cloud.task;

import com.vandana.cloud.task.exception.SuffleException;
import com.vandana.cloud.task.utill.SuffleArray;

public class ArraySuffle {

	public static void main(String[] args) throws SuffleException {
		int[]values= {1,2,3,4,5,6,7};
		try {
			SuffleArray.suffledArray(values);
			for(int value: values) {
				System.out.print(value+" ");
			 }
			}catch(SuffleException e) {
				throw new SuffleException("An error occurred while shuffling the array:" +e.getMessage());
			}
		}
	}

