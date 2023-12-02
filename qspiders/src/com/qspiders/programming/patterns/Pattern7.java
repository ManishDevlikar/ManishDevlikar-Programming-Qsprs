package com.qspiders.programming.patterns;

public class Pattern7 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i==5||i==3||(j==1&&i>=3)||(j==5&&i>=3)||(j==3&&i<=3)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
