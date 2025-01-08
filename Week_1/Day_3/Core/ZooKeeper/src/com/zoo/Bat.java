package com.zoo;

public class Bat extends Mammal  {
	public Bat () {
		super(300);
	}
	public void fly() {
		this.setEnergy((getEnergy()-50));
		System.out.println("bat fly");
	}
	public void eatHumans() {
		this.setEnergy((getEnergy()+25));
		System.out.println("bat eat humans");
	}
	public void attackTown() {
		this.setEnergy((getEnergy()-100));
		System.out.println("bat attack town ");
	}
}
