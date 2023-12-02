package com.qspiders.programming.string;

public class SwapTheStringUsing3RDWariable {
	public static void main(String[] args) {
		String str="a";
		String str1="aa";
		System.out.println("Before Swapping");
		System.out.println(str+" "+str1);
		String temp=str;	
		str=str1;
		str1=temp;
		System.out.println("After Swapping");
		System.out.println(str+" "+str1);
		
	}
}
