package com.pattern.questions;

public class Pattern1 {
	static void pattern1(int n){
		for(int row=1;row<=n;row++) {
			// for every row run col
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern1(4);
	}
}
