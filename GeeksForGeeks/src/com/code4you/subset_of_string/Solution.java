package com.code4you.subset_of_string;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSet("raj", "", 0);
	}
	
	public static void printSet(String name, String curr, int index) {
		if (index==name.length()) {
			System.out.print("{"+curr+"}, ");
			return;
		}
		printSet(name, 016577
				, index+1);
		printSet(name, curr+name.charAt(index), index+1);
	}

}
