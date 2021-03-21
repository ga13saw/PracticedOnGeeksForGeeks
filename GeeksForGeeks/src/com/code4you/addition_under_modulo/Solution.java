package com.code4you.addition_under_modulo;

public class Solution {

	public static void main(String[] args) {

		System.out.println(sumUnderModulo(1000000007, 1000000007));
		System.out.println(inverseModulo(6, 37));
	}

	public static long sumUnderModulo(long a, long b) {
		int m = 1000000007;

		return (a % m + b % m) % m;
	}
	
	public static int inverseModulo(int a, int m) {
		a=a%m;
		for (int i = 1; i < m; i++) {
			if((a*i)%m==1){
				return i;
			}
		}
		return -1;
	}

}
