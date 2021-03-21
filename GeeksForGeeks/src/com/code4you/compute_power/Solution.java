package com.code4you.compute_power;

public class Solution {

	public static void main(String[] args) {
		System.out.println(computePower(2, 6));
		System.out.println(compPowEffi(2, 5));
		System.out.println(comPowBin(2, 5));

	}
	//time complexity: O(n)
	public static int computePower(int num, int pow) {
		
		int resultPow = 1;
		for (int i = 0; i < pow; i++) {
			resultPow*=num;
		}
		
		return resultPow;
	}
	//time complexity: O(log n)
	public static int compPowEffi(int num, int pow) {
		if (pow==0) {
			return 1;
		}
		int temp = compPowEffi(num, pow/2);
		temp*=temp;
		if (pow%2==0) {
			return temp;
		}
		else {
			return temp*num;
		}
	}
	
	//using binary representation of pow........TC=O(log n) and SC= O(1)
	public static int comPowBin(int num, int pow) {//for pow =5, bin = 0101
		int result=1;
		while (pow>0) {
			//for odd , enter into loop
			if (pow%2!=0) {
				result*=num;
			}
			num*=num;
			pow/=2;
		}
		return result;
	}
}
