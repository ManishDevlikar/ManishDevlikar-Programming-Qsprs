package com.basic.java;

public class ReverseNumbers {
	public static void main(String[] args) {
		int num =2345;
		int ans=0;
				while(num>0) {
					int rem =num%10;
					num =num/10; //each time last degits get deleted
					ans=ans*10+rem;
				}
				System.out.println(ans);

		
	}

}
