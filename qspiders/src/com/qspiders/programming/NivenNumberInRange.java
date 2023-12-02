package com.qspiders.programming;

import java.util.Scanner;

public class NivenNumberInRange {
	public static void main(String... x) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int sum=0;
		int count=0;
		
		for(int i=1;i<=t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int temp=a;
			for(;a<=b;a++) {
				int mod=temp%10;
				sum+=mod;
				temp/=10;
			}
			if(a%sum==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
