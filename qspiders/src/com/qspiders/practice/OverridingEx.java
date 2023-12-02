package com.qspiders.practice;

public class OverridingEx {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add());
		Calculator c1=new Add();
		System.out.println(c1.add());
	}
}
class Calculator{
	public  int add() {
		return 3+3;
	}
}

class Add extends Calculator{
	public  int add() {
		return 3+6;		
	}
}