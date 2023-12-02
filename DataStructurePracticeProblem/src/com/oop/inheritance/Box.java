package com.oop.inheritance;

public class Box {
	double h;
	double w;
	double l;
	public Box() {
		this.h=-1;
		this.w=-1;
		this.l=-1;
	}
	public Box(double side) {
		this.h=side;
		this.w=side;
		this.l=side;
	}
	public Box(double h,double w,double l) {
		this.h=h;
		this.w=w;
		this.l=l;
	}
	public Box(Box obj) {
		this.h=obj.h;
		this.w=obj.w;
		this.l=obj.l;
	}
}
