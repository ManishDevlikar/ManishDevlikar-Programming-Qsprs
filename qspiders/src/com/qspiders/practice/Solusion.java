package com.qspiders.practice;

public class Solusion {
	public static long sumOrProduct(int n, int q) {
		long sum=0;
		long prod=1;
		
		if(q==1) {
			for (int i = 1; i <=n; i++) {
				sum=sum+i;
			}
			return sum;
		}else if(q==2) {
			for (int i = 1; i <=n; i++) {
				prod=prod*i;
			}
			return prod;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(sumOrProduct(15,2));
	}
}
