package com.pattern.questions;

public class Pattern6 {
	static void pattern6(int n) {
		for(int row=0;row<2*n;row++){
			int totalCol=row>n?2*n-row:row;
			
//			int noOfSpaces=n-totalCol;
			for(int space=0;space<n-totalCol;space++) {
				System.out.print(" ");
			}
			for(int col=0;col<totalCol;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern6(5);
	}
}
