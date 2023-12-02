package com.bitwise_and_number_system;

public class CalculatePowerOfNumber {

	public static void main(String[] args) {
		int base=3;
		int power=2;
		int answer=1;
		while(power>0) {
			if((power&1)==1) {
				answer=answer*base;
			}
			base=base*base;
			power=power>>1;
		}
		System.out.println(answer);
	
		

	}

}
