package com.oop.interfaces;

public class CDPlayer implements MusicPlayer {

	@Override
	public void start() {
	System.out.println("Start the Music");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the Music");
		
	}

}
