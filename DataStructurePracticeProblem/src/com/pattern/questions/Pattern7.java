package com.pattern.questions;

public class Pattern7 {
	static void pattern7(int n) {
		for(int row=1;row<=n;row++) {
			for(int space=0;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			for(int col2=2;col2<=row;col2++) {
				System.out.print(col2);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern7(4);
	}
}
