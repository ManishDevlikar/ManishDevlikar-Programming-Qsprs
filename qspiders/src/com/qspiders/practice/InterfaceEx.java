package com.qspiders.practice;

public class InterfaceEx {
	public static void main(String[] args) {
		Multiplication a=new Multiplication();// sub-class object ref
//		System.out.println(a.add(2, 3));
//		System.out.println(a.i);
//		System.out.println(a.j);
		
		
		access a1=new access();//super class object ref
//		System.out.println(a1.add(2, 3));
//		System.out.println(a1.i);
//		System.out.println(a1.j);

		access a2=new Multiplication();//up-casting
//		System.out.println(a1.i);
//		System.out.println(a1.j);
		

		Multiplication m=(Multiplication)a2;//down-casting
		System.out.println(m.i);
		System.out.println(m.j);
//		System.out.println(m.add(5, 8));
		

	}

}
interface Calc{
	 int a=0;
	
	public int add(int a,int b);
	
	
	
	
}

interface random {
	public int add(int a,int b);
}

class access {
	int i=20;
	public  int add(int a,int b) {
		return a+b;
	}
}

class Multiplication extends access{
//	int i=999;
	int j=100;
	public  int add(int a,int b) {
		return a*b;
	}
}