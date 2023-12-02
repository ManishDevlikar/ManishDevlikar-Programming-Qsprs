package com.oop.interfaces;

public class Car implements Brake,Engine,MusicPlayer {


	@Override
	public void start() {
		System.out.println("Start the engine");
		
	}

	@Override
	public void stop() {
		System.out.println("stop the engine");
		
	}

	@Override
	public void acc() {
		System.out.println("acc the engine");
		
	}

	@Override
	public void brake() {
		System.out.println("apply brake to stop car");
		
	}

}
