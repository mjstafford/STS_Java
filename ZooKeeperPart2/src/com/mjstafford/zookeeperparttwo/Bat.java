package com.mjstafford.zookeeperparttwo;

import com.mstafford.zookeeperpartone.Mammal;

public class Bat extends Mammal {
	public Bat(){
		setEnergyLevel(300);
	}
	
	public void fly(){
		System.out.println("wooosh (bat flying)");
		int currEnergy = this.getEnergyLevel();
		this.setEnergyLevel(currEnergy - 50);
	}

	public void eatHuman(){
		System.out.println("1 humans blood sucked, muah ha ha");
		int currEnergy = this.getEnergyLevel();
		this.setEnergyLevel(currEnergy + 25);
	}
	
	public void attack(){
		System.out.println("sssSSssspphphhhhh(bat attacking town)");
		int currEnergy = this.getEnergyLevel();
		this.setEnergyLevel(currEnergy - 100);
	}
}
