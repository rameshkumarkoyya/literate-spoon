package com.math;

public class FactorialUsingRecursiveApproach {
	
	/*
	 * Formula : result =  numb * factorial(numb - 1)
	 */
	
	public static void main(String args[]) {
		System.out.println(factorial(5));
	}
	
	private static int factorial(int numb) {
		if(numb == 0) {
			return 1;
		}
		return numb * factorial(numb - 1);
		
	}

}
