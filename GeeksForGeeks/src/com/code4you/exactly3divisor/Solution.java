package com.code4you.exactly3divisor;

public class Solution {

	public static void main(String[] args) {
		System.out.println(exactly3Divisors(150));
		//System.out.println(exactly3D(100));
	}
	
	public static int exactly3D(int N) {
		if (N == 1 || N == 2 || N == 3) {
			return 0;
		}
		int count = 0;
		for (int i = 2; i*i <= N; i++) {//loop take O(root of n )
			if (isPrime2(i)) {  
				count++;
			}
		}
		return count;
	}
	
	
	//10 4 6 8 9 
	public static int exactly3Divisors(int N) {
		if (N == 1 || N == 2 || N == 3) {
			return 0;
		}
		int count = 0;
		for (int i = 4; i <= N; i++) {
			if (!isPrime2(i)) {
				//int tempCount = countNoOfDivisor(i);
				int tempCount = countDivisor(i);
				System.out.println(i+"-->"+tempCount);
				if (tempCount == 3) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int countDivisor(int num) {
		int tempCount=0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				tempCount++;
			}
		}
		return tempCount;
	}
	// TC: O(root of n)
	private static int countNoOfDivisor(int num) {
		int tempCount = 0;
		int i;
		for (i = 1; i*i<= num; i++) {
		if (num%i==0) {
			tempCount++;
		}}	
		i--;
		
		for (; i >=1; i--) {
			if (num%i==0&& i!=num/i) {
				tempCount++;
			}
		}
		return tempCount;
	}
	

	public static boolean isPrime2(int num) {
		if (num == 1) {
			return false;
		}
		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

}
