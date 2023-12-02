package com.qspiders.programming;

public class PrintTheSeries {
//	public static void series(int num) {
//		if (num >= -4) {
//			System.out.print(num + " ");
//			series(num - 5);
//			if (num != -4)
//				System.out.print(num + " ");
//		}
//	}

	public static void main(String[] args) {
//		series(10);
		System.out.println();
		printPattern(10);
		System.out.println();
		pattern(10);
	}

	static void printPattern(int n) {

		if (n == 0 || n < 0) {

			System.out.print(n + " ");

			return;
		}

		System.out.print(n + " ");

		printPattern(n - 5);

		System.out.print(n + " ");
	}

	static void pattern(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			pattern(n - 5);

		}
		System.out.print(n + " ");
	}
}
