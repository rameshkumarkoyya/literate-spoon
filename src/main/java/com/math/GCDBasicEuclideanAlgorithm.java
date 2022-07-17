package com.math;

public class GCDBasicEuclideanAlgorithm {

	public static void main(String args[]) {
		int gcd = findGCDByEuclideanAlogirthm(15, 20);
		System.out.println(gcd);
	}

	private static int findGCDByEuclideanAlogirthm(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

}
