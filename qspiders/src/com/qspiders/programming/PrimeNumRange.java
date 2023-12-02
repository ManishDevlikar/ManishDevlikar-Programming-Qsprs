package com.qspiders.programming;

public class PrimeNumRange {
	public static void prime(int start,int end) {
		for (int i = start; i <=end; i++) {
			int count=0;
			for (int j = 1; j <=i ; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		prime(1,100);
		
		
//		int num=1;
//		for(int i=num;i<=100;i++) {
//			int count=0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
	}
}
