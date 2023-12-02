package com.qspiders.programming;

public class ConvertBinoryToDecimal {
	public static void getDecimal(int binary) {
		int res=0;
		int base=1;
		while(binary!=0) {
			int digit=binary%10;
			res=res+digit*base;
			base*=2;
			binary/=10;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		getDecimal(1011);
		System.out.println(0B1011);
	}
}
