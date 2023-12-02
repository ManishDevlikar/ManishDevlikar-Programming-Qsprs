package com.oop.interfaces;

public class ElectricEngine implements Engine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start the Electric Engine");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the Electric Engine");		
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("acc the Electric Engine");
	}

}
