package com.code4you.GP;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(termOfGP(84, 87, 3));
		double tenp = 20/3;
		System.out.println(tenp);
		System.out.println(87/84);
	}
	public static double termOfGP(int A,int B,int N)
    {
        double r = (double)B/(double)A;
        
        return A*(Math.pow(r,N-1));
    }

}
