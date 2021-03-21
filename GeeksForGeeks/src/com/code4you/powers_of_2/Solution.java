package com.code4you.powers_of_2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is 17 pow of 2:"+ powOfTwo(17));
		System.out.println(powOfTwo2(16));
	}
	
	public static boolean powOfTwo(int num) {
		if (num==0) {
			return false;
		}
		
		return ((num & (num-1))==0);
	}
	
	public static boolean powOfTwo2(int num) {
		if (num==0) {
			return false;
		}
		
		while (num!=1) {
			if (num%2!=0) {
				return false;
			}
			num=num/2;
		}
		return true;
	}

}
