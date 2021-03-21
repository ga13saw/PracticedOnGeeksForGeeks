package com.code4you.is_kth_bit_set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBitSet(17, 3));
	}
	
	public static boolean isBitSet(int n, int k) {
		if ((n & (1<<k)) ==0) {
			return false;
		}
		return true;
	}

}
