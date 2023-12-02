package com.qspiders.programming;

public class SumOfDivBy3 {
	public static int sumOfDivByThree(int n) {
		int res=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0) {
				res+=i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(sumOfDivByThree(10));
	}
}
