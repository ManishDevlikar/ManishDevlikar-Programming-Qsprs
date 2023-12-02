package com.pattern.questions;

public class Pattern3 {
	static void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern3(4);
	}
}
