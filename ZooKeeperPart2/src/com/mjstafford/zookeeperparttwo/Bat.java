package com.mjstafford.zookeeperparttwo;

import com.mstafford.zookeeperpartone.Mammal;

public class Bat extends Mammal {
	public Bat(){
		this.setEnergyLevel(300);
	}
	
	public void fly(){
		System.out.println("wooosh (bat flying)");
		int currEnergy = super.getEnergyLevel();
		super.setEnergyLevel(currEnergy - 50);
	}

	public void eatHuman(){
		System.out.println("1 humans blood sucked, muah ha ha");
		int currEnergy = super.getEnergyLevel();
		super.setEnergyLevel(currEnergy + 25);
	}
	
	public void attack(){
		System.out.println("sssSSssspphphhhhh(bat attacking town)");
		int currEnergy = super.getEnergyLevel();
		super.setEnergyLevel(currEnergy - 100);
	}
}
