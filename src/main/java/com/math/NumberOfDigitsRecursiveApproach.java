package com.math;

public class NumberOfDigitsRecursiveApproach {
	
	public static void main(String args[]) {
		final int count = findNumberOfDigitsRecursiveApproach(1234);
		System.out.println(count);
	}
	
	private static int findNumberOfDigitsRecursiveApproach(int numb) {
		int count = 0;
		if(numb != 0) {
			count =  1 + findNumberOfDigitsRecursiveApproach(numb / 10);
		}
		return count;
	}

}
