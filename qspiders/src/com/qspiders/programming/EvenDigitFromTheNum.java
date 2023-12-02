package com.qspiders.programming;

public class EvenDigitFromTheNum {
	public static void seprate(int num) {
		
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {	
			System.out.println(rem);
			}
			num/=10;
		}
	}
	public static void main(String[] args) {
		seprate(203765);
	}
}
