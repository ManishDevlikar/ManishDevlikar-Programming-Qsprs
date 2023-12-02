package com.bitwise_and_number_system;

public class FindNumberOfDigitInBase {
	public static void main(String[] args) {
		
	
	int number=10;
	int base=2;
	int answer=(int)(Math.log(number)/(Math.log(base))+1);
	System.out.println(answer);
}
}