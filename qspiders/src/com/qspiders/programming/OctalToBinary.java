package com.qspiders.programming;

public class OctalToBinary {
	public static String getOctalToBinary(int num) {
		int n=getOctalToDecimal(num);
		String res="";
		
		while(n!=0) {
			int rem=n%2;
			res=rem+res;
			n/=2;
		}
		return res;
	}
	public static int getOctalToDecimal(int num) {
		int res=0;
		int base=1;
		while(num!=0) {
			int mod=num%10;
			res=res+mod*base;
			base*=8;
			num/=10;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(getOctalToBinary(67));
	}
}
