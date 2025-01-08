package com.devices;

public class Device {
	int battery;

	public Device() {
		this.battery = 100;
	}
	public void display() {
		System.out.println(getBattery());
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
}
