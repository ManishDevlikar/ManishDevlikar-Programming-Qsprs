package com.qspiders.programming;

public class FindSumOfDigitWithinSingleDigit {
	public static int singleDigit(int num) {
		int sum=0;
		int result=0;
		while(num!=0) {
			int mod=num%10;
			sum+=mod;
			num/=10;
		}
		if(sum>9) {
			while(sum!=0) {
				int mod=sum%10;
				result+=mod;
				sum/=10;
			}
			return result;
		}else {
			return sum;
		}
	}
	public static void main(String[] args) {
		System.out.println(singleDigit(854));
		System.out.println(sumOfDigit(1));
		
	}
	
	public static int sumOfDigit(int num) {
		int sum=0;
		while(num!=0||sum>9) {
			if(num==0) {
				num=sum;
				sum=0;
			}
			int mod=num%10;
			sum+=mod;
			num/=10;
		}
		return sum;
	}
	
}
