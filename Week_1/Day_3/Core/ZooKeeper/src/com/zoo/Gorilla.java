package com.zoo;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		this.setEnergy((getEnergy()-5));
		System.out.println("gorilla throw Somthing");
	}
	public void eatBananas() {
		this.setEnergy((getEnergy()+10));
		System.out.println("gorilla eat bananas");
	}
	public void climb() {
		this.setEnergy((getEnergy()-10));
		System.out.println("gorilla climb");
	}
}
