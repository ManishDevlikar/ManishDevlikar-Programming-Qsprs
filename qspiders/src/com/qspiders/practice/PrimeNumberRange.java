package com.qspiders.practice;

public class PrimeNumberRange {
	public static void getPrime(int start,int end) {
		for (int i = start; i <=end; i++) {
			int count=0;
			for (int j = 1; j <=i ; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" is a prime");
			}
		}
	}
	public static void main(String[] args) {
		getPrime(1,100);
	}
}
