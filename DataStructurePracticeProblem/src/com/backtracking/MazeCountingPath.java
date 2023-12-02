package com.backtracking;

public class MazeCountingPath {
	static int countPaths(int r,int c) {
		if(r==1||c==1) {
			return 1;
		}
	
		int left=countPaths(r-1,c);
		int right=countPaths(r,c-1);
		return left+right;
	}
	public static void main(String[] args) {
		System.out.println(countPaths(3,3));
	}
}
