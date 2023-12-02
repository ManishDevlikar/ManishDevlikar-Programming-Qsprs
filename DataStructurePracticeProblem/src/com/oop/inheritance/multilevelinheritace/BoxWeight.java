package com.oop.inheritance.multilevelinheritace;

public class BoxWeight extends BoxP {
	int weigth;
	BoxWeight(int l,int w,int h,int weight){
		super(l,w,h);
		this.weigth=weight;
	}
}
