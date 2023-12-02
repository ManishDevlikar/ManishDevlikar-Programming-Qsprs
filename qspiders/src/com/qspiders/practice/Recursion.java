package com.qspiders.practice;

public class Recursion {
	
	
	
	public static int printNum(int num) {
		if(num<1) {
			return -1;
		}
		System.out.println(num);
		return printNum(num-1);
	}
	
	
	
	
	
	
	
	public static int fact(int num) {
		if(num<=1) {
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		
		System.out.println(fact(5));
//		printNum(18);
	}
}
