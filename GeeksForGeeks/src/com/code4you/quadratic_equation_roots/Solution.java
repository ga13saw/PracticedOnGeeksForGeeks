package com.code4you.quadratic_equation_roots;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		//280 399 573
		ArrayList<Integer> quadraticRoots = quadraticRoots(83, 720, 621);
		for (Integer integer : quadraticRoots) {
			System.out.print(integer+" ");
		}
	}
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		ArrayList<Integer> list = new ArrayList<>();
		/*double sqrt = Math.sqrt(b*b -4*a*c);
		System.out.println(sqrt);
		System.out.println(-b);
		int temp =-(b/(2*a));
		System.out.println(temp);*/
        int r1 = (int) Math.floor((-b+Math.sqrt(b*b -4*a*c))/(2*a));
        int r2 = (int) Math.floor((-b-Math.sqrt(b*b -4*a*c))/(2*a));
        if (b*b -4*a*c<0) {
        	list.add(-1);
			return list;
		}
       //list.add(Math.max(r1, r2));
       //list.add(Math.min(r1, r2));
	        if (r1>r2) {
				list.add(r1);
				list.add(r2);
			}
	        else {
				list.add(r2);
				list.add(r1);
			}
        return list;
        
    }

}
