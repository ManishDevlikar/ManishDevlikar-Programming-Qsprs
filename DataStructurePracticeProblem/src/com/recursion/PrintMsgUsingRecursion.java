package com.recursion;

public class PrintMsgUsingRecursion {
	static void msg() {
		System.out.println("Hello");
		msg2();
	}
	static void msg2() {
		System.out.println("Hello");
		msg3();
	}
	static void msg3() {
		System.out.println("Hello");
		msg4();
	}
	static void msg4() {
		System.out.println("Hello");

	}
	public static void main(String[] args) {
		msg();
	}
}
