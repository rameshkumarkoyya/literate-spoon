package com.math;

public class NumberOfDigitsLogarthimicApproach {
	
	public static void main(String args[]) 
	{
		int numb = 1234;
		double count = Math.floor(Math.log10(numb) + 1);
		System.out.println(count);
	}

}
