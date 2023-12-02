package com.qspiders.programming;

public class ConvertOctalToDecimal {
	public static void getDecimal(int octal) {
		int res=0;
		int base=1;
		while(octal!=0) {
			int digit=octal%10;
			res=res+digit*base;
			base*=8;
			octal/=10;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		getDecimal(3456);
	}
}
