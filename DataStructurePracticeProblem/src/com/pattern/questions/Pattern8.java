package com.pattern.questions;

public class Pattern8 {
	static void pattern8(int n) {
		for(int row=1;row<=2*n;row++) {
			int totalColNo=row>n?2*n-row:row;
			for(int space=0;space<n-totalColNo;space++) {
				System.out.print(" ");
			}
			for(int col=totalColNo;col>=1;col--) {
				System.out.print(col);
			}
			for(int col2=2;col2<=totalColNo;col2++) {
				System.out.print(col2);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		pattern8(4);
	}
}
