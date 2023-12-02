package com.recursion;

public class FibonaccUsingRecrsioni {
	static int fibonacci(int n) {
//		int a=n-1;
//		int b=n-2;
		if(n<2) {
			
			return n;
		}

		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(4));
	}
}
