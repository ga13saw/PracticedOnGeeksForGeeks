package com.code4you.trailing_zeros;

public class Solution {

	public static void main(String[] args) {
		
		int n = 251;
		System.out.println(countTrailingZeros(n));
	}
	//finds trailing zeros in factorial number of a given number
	
	public static int countTrailingZeros(int n) {
		int count = 0;
		for (int i = 5; i <= n; i=i*5) {
			count = count+n/i;
		}
		return count;
	}

}
