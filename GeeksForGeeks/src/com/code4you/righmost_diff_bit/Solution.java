package com.code4you.righmost_diff_bit;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(posOfRightMostDiffBit(52, 4));
	}
	public static int posOfRightMostDiffBit(int m, int n) {
        
	   int position=1;
	   int one =1;
	   while ((m & one)==(n & one) ) {
		position++;
		one=one<<1;
	}
	   return position;
	        
	}
}
