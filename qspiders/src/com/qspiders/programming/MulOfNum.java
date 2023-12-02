package com.qspiders.programming;

public class MulOfNum {
	public static int mul(int n) {
		int res=1;
		for (int i = 1; i <=n; i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(mul(5));
	}
}
