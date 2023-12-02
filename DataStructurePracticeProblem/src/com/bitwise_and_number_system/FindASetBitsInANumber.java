package com.bitwise_and_number_system;
// total number of ones in Binary number
public class FindASetBitsInANumber {
 static int setBits(int n) {
	 int count=0;
	 while(n>0) {
		 count++;
		n=n&(n-1); 
//		 n-=(n&-n);
		 }
	 return count;
	 }
 public static void main(String[] args) {
	int n=2;
//	System.out.println(Integer.toBinaryString(n));
	System.out.println(setBits(n));
//	System.out.println(n=n&(n-1));
//	System.out.println(n-=(n&-n));
}
}
