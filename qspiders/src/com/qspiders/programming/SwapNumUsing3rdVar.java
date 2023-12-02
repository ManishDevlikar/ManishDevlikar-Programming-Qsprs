package com.qspiders.programming;
// using 3rd variable
public class SwapNumUsing3rdVar {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping");
		System.out.println("a:"+a +" "+"b:" +b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println("a:"+a +" "+"b:" +b);
	}
}
