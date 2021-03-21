package com.code4you.tower_of_hanoi;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TOH(3, 'A', 'B', 'C');
		System.out.println(toh(3,1,3,2));
	}
	
	public static void TOH(int n, char A, char B, char C) {
		if (n==1) {
			System.out.println("Move 1 from "+A+ " to "+ C);
			return;
		}
		
		TOH(n-1, A, C, B);
		System.out.println("Move "+n+" from "+A+" to "+C);
		TOH(n-1, B, A, C);
	}
	
	static long count=0;
    public static long toh(int N, int from, int aux, int to) {
        
        if(N==1){
            System.out.println("move disk 1 from rod "+from+" to "+to);
            count++;
            return count;
        }
        toh(N-1,from,to,aux);
        System.out.println("move disk "+N+" from rod "+from+" to "+to);
        count++;
        toh(N-1,aux,from,to);
        return count;
    }
   /* long moves = 0L;
    if (N >= 1) {
        // recursive call to move top disk from "from" to aux in current call
        moves += toh(N - 1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from +
                           " to rod " + to);
        
        // increment moves
        moves++;
        
        // recursive call to move top disk from aux to "to" in current call
        moves += toh(N - 1, aux, to, from);
    }
    return moves;*/

}
