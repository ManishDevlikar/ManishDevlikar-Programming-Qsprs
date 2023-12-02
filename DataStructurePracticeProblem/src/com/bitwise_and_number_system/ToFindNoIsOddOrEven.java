package com.bitwise_and_number_system;

public class ToFindNoIsOddOrEven {
	static boolean isOdd(int n) {
		return (n&1)==1;
	}
	public static void main(String args[]) {
		int n=9;
		System.out.println(isOdd(n)); 
	}
}
