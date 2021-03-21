package com.code4you.lcm;

public class Solution {

	public static void main(String[] args) {
		int a= 1002, b=1500;
		System.out.println(lcmNumber(a, b));
		System.out.println(lcmNumber2(a, b));
	}
	
	
	public static int lcmNumber(int a, int b) {
		int lcm = Math.max(a, b);
		while (true) {
			if (lcm%a==0 && lcm%b==0) {
				break;
			}
			lcm++;
		}
		return lcm;
	}
	public static int lcmNumber2(int a, int b) {
		return (a * b)/gcd(a,b);
	}
	
	public static int gcd(int a, int b) {
		
		if (b==0) {
			return a;
		}
		
		return gcd(b,a%b);
	}

}
