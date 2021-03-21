package com.code4you.max_pieces_of_rope;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(maxPieces(5, 2, 5, 1));
		System.out.println(maxPieces(23, 11, 9,12));
	}

	public static int maxPieces(int n, int a, int b, int c) {
		if (n == 0) {
			return 0;
		}
		if (n < 0) {
			return -1;
		}

		int res = max(maxPieces(n - a, a, b, c),
				  maxPieces(n - b, a, b, c), 
				  maxPieces(n - c, a, b, c));
		if (res==-1) {
			return -1;
		}
		return res+1;
	}

	private static int max(int maxPieces, int maxPieces2, int maxPieces3) {
		
		return Math.max(maxPieces, Math.max(maxPieces2, maxPieces3));
	}
}
