package com.math;

public class PrimeNumber {
	
	/*
	 *  17 is prime or not 
	 *  start with 2, 4, 8, 16, 32 > 17 so 17 is prime 
	 */

	public static void main(String[] args) {
		System.out.println(isPrime(1031));
	}
	
	private static boolean isPrime(int numb) {
		if(numb == 1) {
			return false;
		}
		
		if(numb == 2 || numb == 3) {
			return true;
		}
		
		if(numb % 2 == 0 || numb % 3 == 0) {
			return false;
		}
		
		for(int i = 5; i * i <= numb; i = i + 6) {
			int secondNumber = i + 2;
			System.out.println("Numbers are : "+ i + " Second Number " + secondNumber);
			if(numb % i == 0 || numb % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}
 