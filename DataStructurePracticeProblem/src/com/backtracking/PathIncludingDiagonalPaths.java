package com.backtracking;
import java.util.ArrayList;
public class PathIncludingDiagonalPaths {
	static ArrayList<String> diagonalPath(String p,int r,int c){
		if(r==1&&c==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list =new ArrayList<>();
		if(r>1&&c>1) {
			list.addAll(diagonalPath(p+'D',r-1,c-1));
		}
		if(r>1) {
			list.addAll(diagonalPath(p+'V',r-1,c));
		}
		if(c>1) {
			list.addAll(diagonalPath(p+'H',r,c-1));
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.println(diagonalPath("",3,3));
	}
}
