package com.qspiders.apracticelast;

public class P1SwapTwoNumber {
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		swapWithoutThirdVariable(2,3);
	}
	public static void swapWithoutThirdVariable(int a,int b) {
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
