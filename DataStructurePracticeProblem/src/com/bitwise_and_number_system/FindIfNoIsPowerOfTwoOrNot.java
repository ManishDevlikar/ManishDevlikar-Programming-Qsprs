package com.bitwise_and_number_system;
// power of one means only one 1 should be there
public class FindIfNoIsPowerOfTwoOrNot {
public static void main(String[] args) {
	int n=5;
	boolean ans=(n&(n-1))==0;
	System.out.println(ans);
}
}
