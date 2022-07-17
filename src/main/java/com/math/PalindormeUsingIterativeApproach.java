package com.math;

public class PalindormeUsingIterativeApproach {

	public static void main(String args[]) {
		System.out.println(isPalindrome(1232));
	}

	/*
	 * 
	 * To Find Each Digit from Last of the Actual Number using actualNumber%10; get
	 * the last digit Update actual number by removing the last digit using
	 * actualNumber = actualNumber/10;
	 * 
	 */

	private static boolean isPalindrome(int actualNumber) {
		int reverseNumb = 0;
		int temp = actualNumber;
		while (temp != 0) {
			int lastDigit = temp % 10;
			reverseNumb = reverseNumb * 10 + lastDigit;
			temp = temp / 10;
		}
		return actualNumber == reverseNumb;
	}

}
