package com.pattern.questions;

public class Pattern2 {
	static void pattern2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		pattern2(4);
	}

}
