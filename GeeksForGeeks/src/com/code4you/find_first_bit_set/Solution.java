package com.code4you.find_first_bit_set;

public class Solution {

	public static void main(String[] args) {
		System.out.println(getFirstSetBitPos(20));
		
	}
	
	public static int getFirstSetBitPos(int n){
        if (n==0) {
			return -1;
		}
	    int position =1;
	    int one=1;
	    while (true) {
	    	if ((n & one) ==one) {
				return position;
			}
		    one = one<<1;
		    position++;
		}
	    
	        
	}

}
