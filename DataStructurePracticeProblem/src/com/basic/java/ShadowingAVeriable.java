package com.basic.java;

public class ShadowingAVeriable {
	static int a=50;
	static void fun() {
		System.out.println(a);
	}


	public static void main(String[] args) {
			System.out.println(a);
			int a=100;  // overwrite static int value
			System.out.println(a);
			fun();

	}

}
