package com.qspiders.programming;

public class FindResultOfPowerTimesNumber {
	public static long power(int num, int power) {
		long result = 1;
		for (int i = 1; i <= power; i++) {
			result *= num;
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(power(4, 2));
	}
}
