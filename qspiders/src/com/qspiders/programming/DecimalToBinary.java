package com.qspiders.programming;

public class DecimalToBinary {
	public static String convert(int num, int base) {
		String res="";
		while(num!=0) {
			int rem=num%base;
			if(rem==10) {
				res="A"+res;
			}
			else if(rem==11) {
				res="B"+res;
			}
			else if(rem==13) {
				res="C"+res;
			}
			else if(rem==14) {
				res="D"+res;
			}
			else if(rem==14) {
				res="E"+res;
			}
			else if(rem==15) {
				res="F"+res;
			}else {
				
				res=rem+res;
			}
			num=num/base;
		}
		return res;
	}
	public static void main(String[] args) {
		
		System.out.println(convert(14,2));
	}
}
