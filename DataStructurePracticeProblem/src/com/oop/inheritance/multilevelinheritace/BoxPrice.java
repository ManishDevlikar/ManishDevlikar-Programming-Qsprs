package com.oop.inheritance.multilevelinheritace;

public class BoxPrice extends BoxWeight{
	int price;
	BoxPrice(int l, int w, int h, int weight,int price) {
		super(l, w, h, weight);
		this.price=price;
	}
	
}
