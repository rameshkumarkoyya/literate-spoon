package com.math;

public class NumberOfDigitsIterativeApproach {
	
	public static void main(String args[]) {
		int numberOfDigits = findNumberOfDigitsInNumber(1245);
		System.out.println(numberOfDigits);
	}
	
	private static int findNumberOfDigitsInNumber(int numb) {
		int count = 0;
		while(numb != 0) {
			numb = numb / 10;
			count++;
		}
		return count;
	}

}
