package com.qspiders.programming;

public class SumOfNumberUsingRecursion {
	public static int sum(int num, int upto) {
		if (num > upto) {
			return 0;
		}
		return num + sum(num + 1, upto);
	}

	public static void main(String[] args) {
		System.out.println(sum(1, 20));
	}
}
