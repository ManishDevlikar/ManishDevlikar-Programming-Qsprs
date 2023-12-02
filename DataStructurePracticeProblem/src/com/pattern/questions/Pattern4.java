package com.pattern.questions;

public class Pattern4 {
	static void pattern4(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern4(4);
	}
}
