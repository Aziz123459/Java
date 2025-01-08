package com.zoo;

public class TestZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla =new Gorilla();
        Bat bat =new Bat();
        gorilla.displayEnergy();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
        gorilla.displayEnergy();
        
        System.out.println("\n ############################## ");

        bat.displayEnergy();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
	}

}
