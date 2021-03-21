package com.code4you.sum_of_digit;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigit2(25378));
	}
	//TC: O(no of digit)
	public static int sumOfDigit(int n) {
		if (n==0) {
			return 0;
		}
		return n%10+sumOfDigit(n/10);
	}
	
	public static int sumOfDigit2(int n) {
		if (n<10) {
			return n;
		}
		return sumOfDigit(n/10)+n%10;
	}

}
