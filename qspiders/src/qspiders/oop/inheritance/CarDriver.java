package qspiders.oop.inheritance;

import qspiders.assignments.Ex;

public class CarDriver {
public static void main(String[] args) {
	
	Car c=new Car("MH 04 0001","BMW","WHITE",10000000);
	Car c1=new Car("MH 04 1111","RR","WHITE",10000000);
	c.printDetails();
	c1.printDetails();
	System.out.println(c);
	
}
}
