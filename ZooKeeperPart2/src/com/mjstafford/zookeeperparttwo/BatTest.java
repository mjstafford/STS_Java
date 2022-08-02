package com.mjstafford.zookeeperparttwo;

import com.mstafford.zookeeperpartone.Mammal;

public class BatTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal testMammal = new Mammal();
		Bat testBat = new Bat();
		
		testMammal.displayEnergy();
		testBat.displayEnergy();
		
		testBat.attack();
		testBat.attack();
		testBat.attack();
		
		testBat.eatHuman();
		testBat.eatHuman();
		
		testBat.fly();
		testBat.fly();
		
		testBat.displayEnergy();
	}
}
