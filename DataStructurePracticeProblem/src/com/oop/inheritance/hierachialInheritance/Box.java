package com.oop.inheritance.hierachialInheritance;

public class Box {
	int h;
	int w;
	int l;
	Box(int h,int w,int l){
		this.h=h;
		this.w=w;
		this.l=l;
	}
	Box(int side){
		this.h=side;
		this.w=side;
		this.l=side;
	}
	Box(Box b){
		this.h=b.h;
		this.w=b.w;
		this.l=b.l;
	}
}
