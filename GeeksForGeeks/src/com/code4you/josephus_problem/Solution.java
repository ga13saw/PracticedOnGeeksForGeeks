package com.code4you.josephus_problem;

public class Solution {
	public static void main(String[] args) {
		System.out.println(josephus2(5,3));
	}
	public static int josephus(int n, int k) {
		if (n==1) {
			return 0;
		}
		
		return (((josephus(n-1, k))+k)%n);
	}
	
	public static int josephus2(int n, int k)
    {
        return (josep(n,k)+1);
    }
    
    public static int josep(int n, int k){
        if(n==1){
            return 0;
        }
        return ((josephus(n-1,k))+k)%n;
    }
}
