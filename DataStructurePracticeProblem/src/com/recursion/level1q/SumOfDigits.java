package com.recursion.level1q;

public class SumOfDigits {
 static int sumOfDigit(int n) {
	 if(n==0) {
		 return 0;
	 }
	 return (n%10)+sumOfDigit(n/10);
 }
 public static void main(String[] args) {
	int n= 1342;
	System.out.println(sumOfDigit(n));
//	System.out.println(n);
//	System.out.println(n%10);
//	System.out.println(""+n/10);
	
}
}
