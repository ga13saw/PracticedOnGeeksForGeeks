package com.code4you.prime_factor;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primeFactorNums = primeFactorNums(450);
		for (Integer integer : primeFactorNums) {
			System.out.print(integer + " ");
		}
		System.out.println();
		primeFactor(315);
		primeFactorEffi(12);// testing num= 450, 12 etc
		printPrimeFactor(450);
	}

	public static ArrayList<Integer> primeFactorNums(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= num / 2; i++) {
			while (num % i == 0 && isPrime2(i)) {
				list.add(i);
				num/=i;
			}
		}
		if (num>1) {
			list.add(num);
		}

		return list;
	}

	// timecomplexsity:n^2logn
	public static void primeFactor(int num) {
		if (isPrime2(num)) {
			System.out.println(num);
		}
		for (int i = 2; i < num; i++) {
			if (isPrime2(i)) {
				if (num % i == 0) {
					int x = i;
					while (num % x == 0) {
						System.out.print(i + " ");
						x = x * i;
					}
				}
			}
		}
		System.out.println();
	}
//time com: O(root of N)
	public static void primeFactorEffi(int num) {
		if (isPrime2(num)) {
			System.out.println(num);
		}

		for (int i = 2; i * i <= num; i++) {

			
				while (num % i == 0) {
					System.out.print(i + " ");
					num = num / i;
				}
			
		}
		if (num>1) {
			System.out.print(num);
		}

		System.out.println();
	}
	
	public static void printPrimeFactor(int num) {
		if (num<=1) {
			return;
		}
		
		while (num%2==0) {
			System.out.print("2 ");
			num/=2;
		}
		while (num%3==0) {
			System.out.print("3 ");
			num/=3;
		}
		for (int i = 5; i*i <= num; i+=6) {
			while (num%i==0) {
				System.out.print(i+" ");
				num/=i;
			}
			while (num%(i+2)==0) {
				System.out.print((i+2)+" ");
				num/=3;
			}
		}
		if (num>3) {
			System.out.println(num);
		}
		System.out.println();
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
