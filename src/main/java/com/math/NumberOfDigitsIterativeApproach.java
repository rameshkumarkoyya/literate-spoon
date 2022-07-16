package com.math;

public class NumberOfDigitsIterativeApproach {
	
	public static void main(String args[]) {
		final int count = findNumberOfDigitsInIterativeApproach(1245);
		System.out.println(count);
	}
	
	private static int findNumberOfDigitsInIterativeApproach(int numb) {
		int count = 0;
		while(numb != 0) {
			numb = numb / 10;
			count++;
		}
		return count;
	}

}
