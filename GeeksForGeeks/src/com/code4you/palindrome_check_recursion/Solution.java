package com.code4you.palindrome_check_recursion;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPndm("RHJtyJHR", 0, 7));
	}
	//NITIN  RHJJHR
	public static boolean checkPndm(String name, int start, int end) {
		
		if (start>=end) {
			return true;
		}
		
		return (name.charAt(start) == name.charAt(end)) && checkPndm(name, start+1, end-1) ;
		
	}

}
