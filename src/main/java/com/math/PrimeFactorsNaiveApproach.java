package com.math;

public class PrimeFactorsNaiveApproach {

	public static void main(String[] args) {
		primeFactors(7);
	}

	private static void primeFactors(int numb) {

		for (int i = 2; i < numb; i++) {
			if (isPrime(numb)) {
				int x = i;

				while (numb % x == 0) {
					System.out.println(i);
					x = x * i;
				};
			}
		}

	}

	private static boolean isPrime(int numb) {

		if (numb == 1) {
			return true;
		}

		if (numb == 2 || numb == 3) {
			return true;
		}

		for (int i = 5; i <= numb; i = i + 6) {
			if (numb % 5 == 0 || numb % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}
