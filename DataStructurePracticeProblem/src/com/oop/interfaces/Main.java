package com.oop.interfaces;

public class Main {
	public static void main(String[] args) {
//	ElectricEngine ele =new ElectricEngine();	
	NiceCar car = new NiceCar();
		car.start();
		car.upgradeEngine();
		car.start();
	}	
}
