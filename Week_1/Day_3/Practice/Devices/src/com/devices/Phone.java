package com.devices;

public class Phone extends Device{

	public Phone() {
		super();
	}
	public void call() {
		this.setBattery((getBattery()-5));
	}
	public void play() {
		this.setBattery((getBattery()-20));
	}
	public void charge() {
		this.setBattery((getBattery()+50));
	}
}
