package com.mstafford.zookeeperpartone;

 class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	
	//better to use super vs this when referencing a parent method
	public void throwThing(){
		System.out.println("Roooooar (item thrown)");
		int currEnergy = super.getEnergyLevel();
		super.setEnergyLevel(currEnergy - 5);
	}

	public void eatBanana(){
		System.out.println("nom nom nom nom nom");
		int currEnergy = super.getEnergyLevel();
		super.setEnergyLevel(currEnergy + 10);
	}
	
	public void climb(){
		System.out.println("(Climbing)");
		int currEnergy = super.getEnergyLevel();
		super.setEnergyLevel(currEnergy - 10);
	}

}
