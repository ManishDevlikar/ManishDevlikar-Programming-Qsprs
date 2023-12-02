package com.oop.exceptionHandling;

public class ExceptionEX {
	public static void main(String[] args) {
		int a=4;
		int b=0;
		try {
		int c=a/b;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			int c=a+b;
			System.out.println(c);
		}
	}
}
