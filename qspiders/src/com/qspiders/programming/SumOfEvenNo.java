package com.qspiders.programming;

public class SumOfEvenNo {
	public static int Sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(Sum(6));
	}
}
