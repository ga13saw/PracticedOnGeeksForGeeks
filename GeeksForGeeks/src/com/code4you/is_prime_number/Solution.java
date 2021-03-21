package com.code4you.is_prime_number;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeNumber(24));
		System.out.println(isPrime(71));
		System.out.println(isPrime2(7));
	}
	
	public static boolean isPrimeNumber(int num) {
		//1 is either composite nor prime
		if (num==1) {
			return false;
		}
		if (num==2) {
			return true;
		}
		
		for (int i = 2; i <= num/2; i++) {
			if (num%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static boolean isPrime(int num) {
		if (num==1) {
			return false;
		}
		if (num==2) {
			return true;
		}
		for (int i = 2; i*i <= num; i++) { //checking upto root of num
			if (num%i==0) {
				return false;
			}
		}
		
		return true;
	}
		
	public static boolean isPrime2(int num) {
		if (num==1) {
			return false;
		}
		if (num==2 || num==3) {
			return true;
		}
		if (num%2==0 || num%3==0) {
			return false;
		}
		for (int i = 5; i*i <= num; i+=6) {
			if (num%i==0 || num%(i+2)==0) {
				return false;
			}
		}
		
		return true;
	}

}








