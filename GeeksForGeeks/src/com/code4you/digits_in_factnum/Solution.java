package com.code4you.digits_in_factnum;

public class Solution {

	public static void main(String[] args) {
		System.out.println(digitsInFactorial(120));
	}
	// Use Kamenetsky formula to calculate for very large num
	public static int digitsInFactorial(int N) {
		// code here
		// constants
		double M_E = 2.71828182845904523536;
		double M_PI = 3.141592654;
		// factorial of -ve number doesn't exists
		if (N < 0)
			return 0;

		// base case
		if (N <= 1)
			return 1;

		// Use Kamenetsky formula to calculate
		// the number of digits
		double x = (N * Math.log10(N / M_E) + Math.log10(2 * M_PI * N) / 2.0);

		return (int) Math.floor(x) + 1;
		
	}
}
