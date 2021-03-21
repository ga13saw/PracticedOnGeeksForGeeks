package com.code4you.sum_of_natural_num;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumTillNum(10));
	}
	
	public static int sumTillNum(int n) {
		if (n==0) {
			return 0;
		}
		
		return n+ sumTillNum(n-1);
		
	}

}
