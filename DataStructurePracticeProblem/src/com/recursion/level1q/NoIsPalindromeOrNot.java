package com.recursion.level1q;

public class NoIsPalindromeOrNot {

	static int reverse2(int n) {
	int digit=(int)(Math.log10(n))+1;
	return helper(n,digit);
	}
	static int helper(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		return rem*(int)(Math.pow(10, digits-1))+helper(n/10,digits-1);
	}
	
	static boolean palindrome(int n) {
		return n==reverse2(n);
		
	}
	public static void main(String[] args) {
		int n=1;
		System.out.println(palindrome(n));
	}
}
