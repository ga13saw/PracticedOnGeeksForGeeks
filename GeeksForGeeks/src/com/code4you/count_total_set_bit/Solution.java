package com.code4you.count_total_set_bit;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swapBits(23));
	}
	public static int swapBits(int x) 
    { 
        // Get all even bits of x = 00010111
        int even_bits = x & 0xAAAAAAAA;  
      
        // Get all odd bits of x 
        int odd_bits = x & 0x55555555;  
      
        // Right shift even bits 
        even_bits >>= 1;  
          
        // Left shift even bits 
        odd_bits <<= 1;  
          
        // Combine even and odd bits 
        return (even_bits | odd_bits);  
    }
	

}
