package com.oop.inheritance;

public class BoxChild extends Box{
	double weight;

	public BoxChild(double weight) {
		this.weight = weight;
	}

	public BoxChild(double h, double w, double l,double weight) {
		super(h, w, l);
		this.weight=weight;
	}
	
	
}
