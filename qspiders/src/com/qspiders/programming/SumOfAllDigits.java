package com.qspiders.programming;

public class SumOfAllDigits {
public static void seprate(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			 sum+=rem;

			num/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		seprate(203765);
	}
}
