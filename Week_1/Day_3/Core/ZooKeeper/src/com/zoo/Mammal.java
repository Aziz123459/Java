package com.zoo;

public class Mammal {
	int energy;
	public Mammal() {
		this.energy=100;
	}
	
	public Mammal(int energy) {
		this.energy = energy;
	}

	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void displayEnergy() {
		System.out.println("Energy : " + this.energy);
	}
}
