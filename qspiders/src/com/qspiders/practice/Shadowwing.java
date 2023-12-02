package com.qspiders.practice;

public class Shadowwing {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		p1.show();
		p1.display();
		System.out.println("--------------------");
		
		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.show();
		c1.display();
		System.out.println("--------------------");
		
		Parent p2 = new Child(); //Up-casting
		System.out.println(p2.a);
		System.out.println(p2.b);
		p2.show();
		p2.display();
		System.out.println("--------------------");
		
		Child c2 = (Child) p2;  //Down-casting
		System.out.println(c2.a);
		System.out.println(c2.b);
		c2.show();
		c2.display();
	}
}

class Parent{
	int a=100;
	static int b=200;
	
	public static void show() {
		System.out.println("in parent class");
	}
	public  void display() {
		System.out.println("in parent class non static");
	}
}
class Child extends Parent{
	int a=500;
	static int b=600;
	
	public static void show() {
		System.out.println("in child class");
	}
	public void display() {
		System.out.println("in child class non static");
	}
}