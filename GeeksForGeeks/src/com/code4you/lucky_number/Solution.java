package com.code4you.lucky_number;

import java.util.ArrayList;

public class Solution {
	
	static int counter = 2;
	public static void main(String[] args) {
		System.out.println(isLucky(19));
//System.out.println(numbers(100));
	}

    
    // Return True if the given number is a lucky number else return False
	//taking long time with complexity O(root of n * size of list)
    public static boolean isLucky(int n)
    {
    	ArrayList<Integer> nums = new ArrayList<>();
    	for (int i = 1; i <= n; i++) {
			nums.add(i);
		}
    	
		for (int i = 1; i*i<= n; i++) {
			if (nums.indexOf(n)+1%counter==0) {
				return false;
			}
			int t=1;
			int size = nums.size();
			for (int j = counter; j<=size; j+=counter) {
				nums.remove(j-t++);
			}
			counter++;
		}
		return true;
		
        
    }
    //optimize the code
    public static boolean isLucky2(int n)
    {
    	 int next_position = n;
         if(counter > n)
             return true;
         if(n%counter == 0)
             return false;      
   
         // calculate next position of input no
         next_position -= next_position/counter;
     
         counter++;
         return isLucky(next_position);
		
        
    }
    
    //this method is for printing the number and how num series changes
    public static boolean numbers(int n) {
    	ArrayList<Integer> nums = new ArrayList<>();
    	for (int i = 1; i <= n; i++) {
			nums.add(i);
			System.out.print(i+" ");
		}
    	
    	System.out.println();
    	//nums.lastIndexOf(nums.get(nums.size()))
		for (int i = 1; i*i< n; i++) {
			int t=1;
			//System.out.println(nums.size());
			int size = nums.size();
			for (int j = counter; j<=size; j+=counter) {
				
				nums.remove(j-t++);
			}
			for (Integer integer : nums) {
				System.out.print(integer+" ");
			}
			counter++;
			System.out.println();
		}
		if (nums.contains(n)) {
			return true;
		}else {
			return false;
		}
		
	}
    
    public static boolean name(int n) {
    	if (n==1) {
			return true;
		}else {
			return false;
		}
	}

}
