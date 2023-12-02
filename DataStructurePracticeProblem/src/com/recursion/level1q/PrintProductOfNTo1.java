package com.recursion.level1q;

public class PrintProductOfNTo1 {
	static void product(int n,int m) {
		if(n==0) {
			return;
		}
		System.out.print(n*m+" ");
		product(n-1,m);
	}
	public static void main(String[] args) {
		product(10,1);
	}
}
