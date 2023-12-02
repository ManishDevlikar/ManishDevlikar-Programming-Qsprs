package com.qspiders.practice;

abstract public class AbstractionEx {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.show();
		
		System.out.println(a.addTwoNum());
//		AbstractClass abs;
	
	}
}

abstract class AbstractClass {

	public void show() {
		System.out.println("In abstract Class");
	}
	public int addTwoNum() {
		return 3+7;
	}
	abstract public int addThreeNum(int a,int b,int c);
	{
		System.out.println("Inside Abstract non-static block");
	}
	static {
		System.out.println("inside abstract static block");
	}
}

class Addition extends AbstractClass{

	public int addThreeNum(int a,int b,int c) {
		return a+b+c;
	}
	public  void show() {
		System.out.println("In Concreate Class");
	}
	{
		System.out.println("Inside Concreate non-static block");
	}
	static {
		System.out.println("inside concreate static block");
	}
	public int addTwoNum() {
		return 4+9;
	}
}