package com.oop.inheritance.hierachialInheritance;

public class BoxColor extends Box {
	String color;
	BoxColor(int h,int w,int l,String color){
		super(h,w,l);
		this.color=color;
	}
	BoxColor(int side,String color){
		super(side);
		this.color=color;
	}
	BoxColor(Box b,String color){
		super(b);
		this.color=color;
	}
}
