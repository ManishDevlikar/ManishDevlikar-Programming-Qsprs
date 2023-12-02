package com.qspiders.programming;

public class PalindromeOrNot {
	static void isPalindrome(int num) {
		int temp=num;
		int res=0;
		while(temp!=0) {
			int mod=temp%10;
			res=(res*10)+mod;
			temp/=10;
		}
		if(num==res) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}
	public static void main(String[] args) {
		isPalindrome(121);
	}
}
