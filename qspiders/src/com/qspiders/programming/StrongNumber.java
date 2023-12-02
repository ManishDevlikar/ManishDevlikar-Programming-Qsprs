package com.qspiders.programming;

public class StrongNumber {
	static void strongNumber(int num) {
		int sum = 0;
		int temp = num;
		while (num != 0) {
			int mod = num % 10;

			sum += factorial(mod);
			num /= 10;
		}
		if (sum == temp) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a strong Number");
		}
	}

	public static int factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		strongNumber(145);
	}
}
