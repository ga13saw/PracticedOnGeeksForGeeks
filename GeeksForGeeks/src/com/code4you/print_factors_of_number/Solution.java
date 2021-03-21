package com.code4you.print_factors_of_number;

public class Solution {

	public static void main(String[] args) {
		int num = 420;
		printFactors(30);
		printFactorsEffi(23);
	}
	
	//naive based approach..normal loop with complexity O(n)
	private static void printFactors(int num) {
		
		for (int i = 1; i <= num/2; i++) {
			if (num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(num+"\n");
	}
	
	//complexity O(root of n)
	public static void printFactorsEffi(int num) {
		int i;
		for ( i = 1; i*i <= num; i++) {
			if (num%i==0) {
				System.out.print(i+" ");
			}
		}
		i--;
		for (; i >=1; i--) {
			if (num%i==0 && i!=num/i) {
				System.out.print(num/i+" ");
			}
		}
		System.out.println();
	}
	
	

}
