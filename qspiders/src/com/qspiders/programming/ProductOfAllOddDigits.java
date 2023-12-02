package com.qspiders.programming;

public class ProductOfAllOddDigits {
	public static void seprate(int num) {
		int sum=1;
		int evenRes=0;
		int oddRes=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2!=0) {	
				oddRes+=rem;	
				}
			if(rem%2==0) {
				evenRes+=rem;
			}
			sum=evenRes*oddRes;
			num/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		seprate(2514795);
	}
}
