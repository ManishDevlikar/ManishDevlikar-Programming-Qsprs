package com.qspiders.programming;
// perfect number or not
public class perfectNumrange {
	public static void isPerfect(int start,int end) {
		for (int i =start; i <=end; i++) {
			int sum=0;
			for (int j = 1; j < i; j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		isPerfect(1,1000);
	}
}
