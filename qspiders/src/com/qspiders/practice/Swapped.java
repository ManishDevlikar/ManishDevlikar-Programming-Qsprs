package com.qspiders.practice;

public class Swapped {
	public static void swapped(int a,int b) {
		System.out.println("Without swapped"+ a + " " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Afte Swapped"+ a + " " + b);
		
	}
	public static void main(String[] args) {
		swapped(2,3);
	}
}
