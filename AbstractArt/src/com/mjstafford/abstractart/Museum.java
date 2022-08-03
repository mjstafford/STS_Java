package com.mjstafford.abstractart;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {
	public ArrayList<Art> museum;	//Abstract class is used so we can store either in the list

	public static void main(String[] args) {
		Painting painting1 = new Painting("cold", "Jimmy", "A cold night", "Acrylic");
		Painting painting2 = new Painting("hot", "Jay", "A hot night", "oil");
		Painting painting3 = new Painting("rain", "Michael", "rain falling", "oil");
		
		Sculpture sculpture1 = new Sculpture("butternut", "Sara", "a dog", "clay");
		Sculpture sculpture2 = new Sculpture("Willow", "John", "statue", "marble");
		
		ArrayList<Art> museum = new ArrayList<Art>();
		museum.add(painting1);
		museum.add(painting2);
		museum.add(painting3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		
		Collections.shuffle(museum);
		
		for(Art art : museum) {
			art.viewArt();
			System.out.println("");
		}
	}

}
