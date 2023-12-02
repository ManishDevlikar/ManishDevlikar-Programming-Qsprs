package qspiders.oop.inheritance;

public class Vehicle {
	String vehicleNo;
	String brand;
	String color;
	double price;
	
	Vehicle(String vehicleNo,String brand,String color,double price){
		this.vehicleNo=vehicleNo;
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void printDetails() {
		System.out.println("Car number: "+this.vehicleNo);
		System.out.println("Car Brand: "+this.brand);
		System.out.println("Car color: "+this.color);
		System.out.println("Car Price: "+this.price);
		System.out.println(this);
		
	}
}
