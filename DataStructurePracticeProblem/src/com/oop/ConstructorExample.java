package com.oop;

public class ConstructorExample {
	int rollNo;
	String name;
	float marks;
	public ConstructorExample(int rollNo,String name,float marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	ConstructorExample(ConstructorExample other){
		this.rollNo=other.rollNo;
		this.name=other.name;
		this.marks=other.marks;
		
	}
	ConstructorExample(){
		// calling constructor from another constructor
		this(1,"Defalt",100.0f);
		
	}
	
	
	void greeting() {
		System.out.println("my name is "+this.name);
	}
	void changeName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		ConstructorExample ce=new ConstructorExample(1,"manish",90);
		ConstructorExample ce1=new ConstructorExample(ce);
		ConstructorExample ce2=new ConstructorExample();
	System.out.println(ce2.name);
	}
}

