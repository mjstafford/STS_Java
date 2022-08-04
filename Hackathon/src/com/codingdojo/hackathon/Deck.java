package com.codingdojo.hackathon;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards;
	
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            for (Integer rank = 2; rank <= 14; rank++) {
                this.cards.add(new Card(name, rank));
            }
        }
    }

    public int getSize() {
    	return this.cards.size();
    }
    
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public ArrayList<Card> ShuffleCards(){
		Collections.shuffle(this.cards); 
		return this.cards;
	}
	
	public Card dealCard() {
		return this.cards.remove(this.cards.size() - 1);
	}
    
}
