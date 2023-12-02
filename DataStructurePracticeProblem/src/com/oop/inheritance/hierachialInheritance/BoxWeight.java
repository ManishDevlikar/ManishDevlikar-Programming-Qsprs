package com.oop.inheritance.hierachialInheritance;

public class BoxWeight extends Box {
	int weight;
	BoxWeight(int h,int w,int l,int weight){
		super(h,w,l);
		this.weight=weight;
	}
	BoxWeight(int side ,int weight){
		super(side);
		this.weight=weight;
	}
	BoxWeight(Box b, int weight){
	super(b);
	this.weight=weight;
	}
	
}
