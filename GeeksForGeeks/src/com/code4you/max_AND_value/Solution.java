package com.code4you.max_AND_value;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = {4, 8, 12, 16};
		int arr[] = { 4, 8, 16, 2 };
		System.out.println(maxAND(arr, 4));
	}

	public static int maxAND(int arr[], int n) {

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (max < (arr[i] & arr[j])) {
					max = (arr[i] & arr[j]);
				}
			}
		}
		return max;

	}

	// Function for finding maximum and value pair
	public static int maxAND2(int arr[], int n) {

		int res = 0, count;

		// iterate over total of 30bits
		// from msb to lsb
		for (int bit = 31; bit >= 0; bit--) {
			// find the count of element
			// having set msb
			count = checkBit(res | (1 << bit), arr, n);

			// if count >= 2 set particular
			// bit in result
			if (count >= 2)
				res |= (1 << bit);
		}

		return res;

	}

	public static int checkBit(int pattern, int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if ((pattern & arr[i]) == pattern)
				count++;
		return count;
	}
}
