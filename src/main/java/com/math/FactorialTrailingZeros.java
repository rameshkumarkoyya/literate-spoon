package com.math;

public class FactorialTrailingZeros {

	public static void main(String[] args) {
		System.out.println(trailingZeros(251));
	}
	
	private static int trailingZeros(int numb) {
		int result = 1;
		for(int i = 5; i <= numb;  i = i * 5) {
			result = result + numb / i;
		}
		return result;
	}

}
