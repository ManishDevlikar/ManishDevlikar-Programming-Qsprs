package com.qspiders.practice;

public class InheritanceEx {
	public static void main(String[] args) {
//		MyParent p=new MyParent();
//		System.out.println(p.rank);
//		p.printDetails();
//		System.out.println(p.age);
//		System.out.println("-------------------------------");
//		MyChild c=new MyChild();
//		System.out.println(c.rank);
//		c.printDetails();
//		System.out.println(c.age);
//		System.out.println("-------------------------------");
		MyParent c=new MyChild();//up-casting
//		System.out.println(c.rank);
//		c.printDetails();
//		System.out.println(c.age);
		System.out.println("-------------------------------");
//		MyChild c=new MyParent();//down-casting
		MyChild c1=(MyChild)c;
		System.out.println(c1.rank);
		c1.printDetails();
		System.out.println(c1.age);
	}
	
}
class MyParent{
	static int rank=100;
	String name="manish";
	int age=30;
	
	public void printDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	{
		System.out.println("inside super");
	}
}
class MyChild extends MyParent{
	String name="xpa";
	int age=3;
	String friend="naveen";
	static int rank=400;
	
	public void printDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.friend);
	}
	{
		System.out.println("inside child");
	}
}