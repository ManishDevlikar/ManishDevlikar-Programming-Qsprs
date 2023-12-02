package com.qspiders.programming;

public class SpecialNumber {
	public static void specialNumber(int num) {
		int sum=0;
		int prod=1;
		int temp=num;
		while(temp!=0) {
			int mod=temp%10;
			sum+=mod;
			prod*=mod;
			temp/=10;
		}
		int res=sum+prod;
		System.out.println(res);
		System.out.println(num);
		if(res==num) {
			System.out.println(" a psecial Number");
		}else {
			System.out.println("not a special Number");
		}
	}
	public static void main(String[] args) {
		specialNumber(19);
	}
}
