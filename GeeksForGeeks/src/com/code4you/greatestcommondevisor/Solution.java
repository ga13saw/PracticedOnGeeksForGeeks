package com.code4you.greatestcommondevisor;

public class Solution {

	public static void main(String[] args) {
		int a = 9, b = 7;

		System.out.println(GCD(a, b));
		System.out.println(euclideanGCD(a, b));
		System.out.println(efficientEuclideanGCD(a, b));
	}

	public static int GCD(int a, int b) {
		int tempMin = Math.min(a, b);

		for (int i = tempMin; i >= 1; i--) {
			if (a % tempMin == 0 && b % tempMin == 0) {
				break;
			} else {
				tempMin--;
			}
		}

		return tempMin;
	}

	public static int euclideanGCD(int a, int b) {
		while (a != b) {
			if (b > a) {
				b = b - a;	
			}else {
				a=a-b;
			}
		}
		return a;
	}
	
	public static int efficientEuclideanGCD(int a, int b) {
		
		if (b==0) {
			return a;
		}
		
		return efficientEuclideanGCD(b, a%b);
	}
	

}






