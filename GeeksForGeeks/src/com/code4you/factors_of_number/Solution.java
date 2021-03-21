package com.code4you.factors_of_number;

public class Solution {

	public static void main(String[] args) {
		primeNumbers(10);
		primeNumbersSieve(20);
		primeNumSieveEffi(30);
		
	}
	//naive based approach.....space com:O(n*root of n)  ...root of n from isPrime mtd
	public static void primeNumbers(int num) {
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void primeNumbersSieve(int num) {
		boolean[] sieve = new boolean[num+1];
		for (int i = 2; i*i <= num ; i++) {
			if (isPrime(i)) {
				for (int j = 2*i; j <= num; j+=i) {
					sieve[j]=true;
				}
			}
		}
		
		for (int i = 2; i <= num; i++) {
			if (!sieve[i]) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void primeNumSieveEffi(int num) {
		boolean[] seive = new boolean[num+1];
		for (int i = 2; i <= num; i++) {
			if (!seive[i]) {
				System.out.print(i+" ");
				for (int j = i*i; j <= num; j+=i) {
					seive[j]=true;
				}
			}
		}
		System.out.println();
	}
	
	public static boolean isPrime(int num) {
		if (num==1) {
			return false;
		}
		if (num==2 || num==3) {
			return true;
		}
		if (num%2==0 || num%3==0) {
			return false;
		}
		for (int i = 5; i*i <=num ; i+=6) {
			if (num%i==0 || num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

}
