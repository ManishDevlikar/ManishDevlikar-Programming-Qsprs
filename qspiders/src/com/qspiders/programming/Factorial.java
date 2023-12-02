package com.qspiders.programming;

public class Factorial {
	public static int fact(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(recFact(5));
	}
	
	public static int recFact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*recFact(n-1);
		
	}
}
