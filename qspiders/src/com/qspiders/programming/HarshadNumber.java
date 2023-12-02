package com.qspiders.programming;

public class HarshadNumber {
	public static void harshadNumber(int num) {
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int mod=temp%10;
			sum+=mod;
			temp/=10;
		}
		
		if(num%sum==0) {
			System.out.println("niven number");
		}else {
			System.out.println("not a niven number");
		}
	}
	public static void main(String[] args) {
		harshadNumber(27);
	}
}
