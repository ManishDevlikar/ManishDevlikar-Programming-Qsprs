package com.qspiders.programming.patterns;

public class Pattern10 {
	public static void main(String[] args) {
		int temp=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i>=j) {
					System.out.print(temp+" ");
					temp++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	} 
}