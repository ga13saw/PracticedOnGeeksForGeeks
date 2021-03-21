package com.code4you.subset_sum_problem;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {10,20,15,5};
		int n = arr.length;
		int sum=25;
		System.out.println(subSet(arr, n, sum));

	}
	
	public static int subSet(int[] arr,int n, int sum) {
		if(n==0){
			return (sum==0) ? 1: 0;
		}
		
		return subSet(arr, n-1,sum)+subSet(arr,n-1,sum-arr[n-1]);
		
	}

}
