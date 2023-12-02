package com.qspiders.programming;


public class SumOfNumber {
	public static int Sum(int n) {
		int sum=0;
		for (int i = 1; i < n; i++) {
			sum+=i;
		}
		return sum;
	}
public static void main(String... x) {
	System.out.println(Sum(10));
}
}
