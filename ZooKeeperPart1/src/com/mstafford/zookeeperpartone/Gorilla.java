package com.mstafford.zookeeperpartone;

 class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	
	public void throwThing(){
		System.out.println("Roooooar (item thrown)");
		int currEnergy = this.getEnergyLevel();
		this.setEnergyLevel(currEnergy - 5);
	}

	public void eatBanana(){
		System.out.println("nom nom nom nom nom");
		int currEnergy = this.getEnergyLevel();
		this.setEnergyLevel(currEnergy + 10);
	}
	
	public void climb(){
		System.out.println("(Climbing)");
		int currEnergy = this.getEnergyLevel();
		this.setEnergyLevel(currEnergy - 10);
	}

}