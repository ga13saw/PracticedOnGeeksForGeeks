package com.code4you.fibbo_facto_recusion;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(6));
		System.out.println(fibbo(6));
	}

	public static int factorial(int n) {
		if (n<0) {
			return -1;
		}
		
		if (n == 1 || n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}
	
	public static int fibbo(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		
		return fibbo(n-1)+fibbo(n-2);
	}

}
