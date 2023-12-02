package com.qspiders.programming;

public class printNumberOneToFive {
	public static void print(int num) {
		if(num>5) {
			return;
		}
		System.out.println(num);
		print(num+1);
		
		
	}
	public static void main(String[] args) {
		print(1);
	}
}
