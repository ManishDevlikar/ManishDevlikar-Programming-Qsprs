package com.linear.search;

public class FindNumbersWithEvenNumberOfDigits {
	static int findNumbers(int[] nums) {
		int count=0;
		for(int num:nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	// to check whether a number contain even number of digit or not
	static boolean even(int nums) {
		int noOfDigit=digits2(nums);
		
		return noOfDigit%2==0;
	}
	static int digits2(int num) {
		if(num<0) {
			num=num*-1;	
			}
		return (int)(Math.log10(num))+1;
	}
	
	//counts number of digits in a number
	static int digits(int num) {
		if(num<0) {
		num=num*-1;	
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
				return count;
	}
	
	public static void main(String[] args) {
		int[] nums= {123,2334,5678,1243,34,2,11};
		System.out.println(findNumbers(nums));

	}

}
