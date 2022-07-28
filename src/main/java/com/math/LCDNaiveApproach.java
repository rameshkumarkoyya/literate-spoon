package com.math;

public class LCDNaiveApproach {
	
	public static void main(String args[]) {
		int result = leastCommonDivisor(12, 15);
		System.out.print(result);
	}
	
	private static int leastCommonDivisor(int a, int b) {
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a == 0 && res%b == 0) {
				return res;
			}
			res++;
		}
	}

}
