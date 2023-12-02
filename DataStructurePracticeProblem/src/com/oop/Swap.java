package com.oop;

public class Swap {
	
	static void swap(Integer a,Integer b) {
		Integer temp =a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Integer a=5;
		Integer b=10;
		swap(a,b);
		System.out.println(a+" "+b);
	}
}
