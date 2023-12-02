package com.qspiders.practice;

public class TotalFactorsOfNumber {
	static int getFactor(int num) {
		int count=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(getFactor(11));
		getFact(99);
	}
	public static void getFact(int num) {
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
