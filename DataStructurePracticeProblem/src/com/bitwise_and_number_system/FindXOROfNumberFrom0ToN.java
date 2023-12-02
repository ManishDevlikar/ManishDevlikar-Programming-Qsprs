package com.bitwise_and_number_system;

public class FindXOROfNumberFrom0ToN {
	static int XOR(int a) {
		if((a%4)==0) {
			return a;
		}if((a%4)==1) {
			return 1;
		}if((a%4)==2) {
			return a+1;
		}return 0;
	}
	public static void main(String[] args) {
		int a=0;
		int b=4;
		int answer=(XOR(b))^(XOR(a-1));
		System.out.println(answer);
		}
}
