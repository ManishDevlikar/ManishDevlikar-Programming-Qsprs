package com.backtracking;

public class MazeReturnPath {
	static void returnPath(String p,int r,int c) {
		if(r==1&&c==1) {
			System.out.println(p);
			return;
		}
		if(r>1) {
			returnPath(p+'D',r-1,c);
		}
		if(c>1) {
			returnPath(p+'R',r,c-1);
		}
		}
	public static void main(String[] args) {
		returnPath("",3,3);
	}
}



