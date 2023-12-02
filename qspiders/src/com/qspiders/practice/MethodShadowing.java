package com.qspiders.practice;

public class MethodShadowing {
  public static void main(String[] args) {
	p1 sup=new p1();
	sup.show();
	p2 sub=new p2();
	sub.show();
	p1 sup1=new p2();
	sup1.show();
}
}
class p1{
	public static void show() {
		System.out.println("super class method");
	}
}
class p2 extends p1{
	public static void show() {
		System.out.println("sub-class method");
	}
}