package com.qspiders.programming;

public class LargestDigit {
	public static void largest(int num) {
		int max=-9;
		while(num!=0) {
			int mod=num%10;
			if(mod>max) {
				max=mod;
			}
			num=num/10;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		largest(-9395);
	}
	
}
