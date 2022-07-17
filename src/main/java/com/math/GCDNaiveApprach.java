package com.math;

public class GCDNaiveApprach {

	/*
	 * Take minimum number from two elements and check if the element is divisible
	 * by both elements If not decrease the number by one and repeat the process
	 * till it is divisible by both elements.
	 */

	public static void main(String args[]) {
		System.out.println(gcd(10, 15));
	}

	private static int gcd(int a, int b) {
		int result = Math.min(a, b);
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}
		return result;
	}

}
