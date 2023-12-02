package com.oop.exceptionHandling;

public class ExceptionHandlingThrowEX2 {
	static int divid(int a,int b)  throws MyException {
		if(b==0) {
//			throw new ArithmeticException("b should be more than zero ");
			throw new MyException("Number should be greater than zero");
		}
		return a/b;
	}
	public static void main(String[] args) throws MyException {
		try {
		divid(3,0);
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
