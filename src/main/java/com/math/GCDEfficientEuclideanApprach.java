package com.math;

public class GCDEfficientEuclideanApprach {
	
	public static void main(String args[]) {
		System.out.println(gcdEuclideanApproach(15, 21));
	}
	
	private static int gcdEuclideanApproach(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcdEuclideanApproach(b, a%b);
	}

}
