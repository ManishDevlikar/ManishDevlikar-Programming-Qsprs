package com.qspiders.programming;

public class FactorsOfNum {
	public static void factors(int num) {
		int sum=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("------------");
		System.out.println("sum :"+sum);
	}
	public static void main(String[] args) {
		factors(6);
	}
}
