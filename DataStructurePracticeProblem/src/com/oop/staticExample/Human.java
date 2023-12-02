package com.oop.staticExample;

public class Human {
	int age;
	String name;
	int salary;
	boolean married;
	static int population;
	public Human(int age, String name, int salary, boolean married) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		Human.population+=1;
	}
	
public static void main(String[] args) {
//	Human n1=new Human(10,"ram",15000, false);
//	Human n2=new Human(10,"ram",15000, false);
//	Human n3=new Human(10,"ram",15000, false);
	System.out.println(Human.population);
}
}
