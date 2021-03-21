package com.code4you.swap_odd_and_even_bits;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(countSetBits(5));
		//System.out.println(countBits(17));
		//System.out.println(countBits2(17));
		//System.out.println(countBits3(17));
		System.out.println(countBits4(17));
	}

	public static int countSetBits(int n) {
		int setBitCount = 0;
		for (int i = 1; i <= n; i++) {
			int one = 1;
			do {

				if ((i & one) == one) {
					setBitCount++;

				}
				one = one << 1;

			} while (one <= i);
		}
		return setBitCount;

	}

	public static int countSetBits2(int n) {

		int setBitCount = 0;
		for (int i = 1; i <= n; i++) {
			setBitCount += countSetBitsUtil(i);
		}
		return setBitCount;

	}

	public static int countSetBitsUtil(int x) {
		if (x <= 0)
			return 0;
		return (x % 2 == 0 ? 0 : 1) + countSetBitsUtil(x / 2);
	}

	// nieve based approach using number
	public static int countBits(int n) {
		int count = 0;
		for (int j = 1; j <= n; j++) {
			int i = j;
			while (i > 0) {
				if (i % 2 != 0) {
					count++;
				}
				i /= 2;
			}
		}
		return count;
	}

	// nieve based approach using bitwise
	public static int countBits2(int n) {
		int count = 0;
		for (int j = 1; j <= n; j++) {
			int i = j;
			while (i > 0) {
				count += (i & 1);
				i = i >> 1;
			}
		}
		return count;
	}

	// Brian kerningam's algo

	public static int countBits3(int n) {
		int count = 0;
		for (int j = 1; j <= n; j++) {
			int i = j;
			while (i > 0) {
				i = (i & (i - 1));
				count++;
			}
		}
		return count;
	}

	public static int countBits4(int n) {
		n += 1;
		int count = 0;

		for (int x = 2; x / 2 < n; x = x * 2) {
			int quotient = n / x;
			count += quotient * x / 2;

			int remainder = n % x;
			if (remainder > x / 2)
				count += remainder - x / 2;
		}

		// returning total count
		return count;
	}

}
