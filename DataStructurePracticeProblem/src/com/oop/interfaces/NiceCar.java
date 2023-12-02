package com.oop.interfaces;

public class NiceCar {
	private Engine engine;
	private MusicPlayer player =new CDPlayer();
	
	public NiceCar() {
		engine = new PowerEngine();
	}
	public NiceCar(Engine engine) {
		this.engine=engine;
	}
	public void start() {
		engine.start();
	}
	public void stop() {
		engine.stop();
	}
	public void startmusic() {
		player.start();
	}
	public void stopmusic() {
		player.stop();
	}
	public void upgradeEngine() {//(Engine engine)
		this.engine= new ElectricEngine();				//=engine
	}
	
}
