package com.math;

public class LCMEfficientApproach {
	
	/*
	 * Find Least Common Divisor of Two Elements
	 * First Find Out GCM using Euclidean Approach
	 * Then use this below formula to get LCM 
	 *  (a * b) / gcd(a, b)
	 *  
	 *  GCD Time Complexity O(log(min(a, b)))
	 */
	
	public static void main(String args[]) {
		System.out.println(findLCM(4, 12));
	}
	
	private static int findLCM(int a, int b) {
		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;
		return lcm;
	}
	
	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	
	
	

}
 