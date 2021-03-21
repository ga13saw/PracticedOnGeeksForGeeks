package com.code4you.digit_sum_till_single_digit;

public class Solution {

	public static void main(String[] args) {
		System.out.println(digitalRoot(9999));

	}
	//do sum of digit till it become less than 10 or sum is of single digit
	
	
	 public static int digitalRoot(int n)
	    {
	        int temSum = digitCount(n);
	        if(temSum<10){
	            return temSum;
	        }
	        return digitalRoot(temSum);
	    }
	    public static int digitCount(int n){
	        if(n<10){
	            return n;
	        }
	        
	        return digitCount(n/10)+digitCount(n%10);
	    }
}
