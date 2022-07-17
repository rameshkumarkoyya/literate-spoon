package com.math;

public class FactorialUsingIterativeApproach {

	public static void main(String args[]) {
		System.out.println(factorial(5));
	}
	
	private static int factorial(int numb) {
		int result = 1;
		for(int i = 1; i <= numb; i++) {
			result *= i;
		}
		return result;
	}
}
