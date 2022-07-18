package com.math;

public class PrimeNumber {
	
	/*
	 *  17 is prime or not 
	 *  start with 2, 4, 8, 16, 32 > 17 so 17 is prime 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(isPrime(65));
	}
	
	private static boolean isPrime(int numb) {
		if(numb == 1) {
			return false;
		}
		
		for(int i = 2; i * i <= numb; i++) {
			if(numb % i == 0) {
				return false;
			}
		}
		return true;
	}

}
 