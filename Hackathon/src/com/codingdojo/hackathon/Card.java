package com.codingdojo.hackathon;

import java.util.HashMap;

public class Card {
	
	private String suit;
	private int rank;
	private String name;
	private HashMap<String, Integer> suitRank;
	
    public Card(String suit, Integer rank) {
    	this.suit = suit;
    	this.rank = rank;
    	this.name = "";
    	
    	HashMap<Integer, String> names = new HashMap<Integer, String>();
        names.put(14, "Ace");
        names.put(11, "Jack");
        names.put(12, "Queen");
        names.put(13, "King");
        
        this.suitRank = new HashMap<String, Integer>();
        suitRank.put("Clubs", 1);
        suitRank.put("Diamonds", 2);
        suitRank.put("Hearts", 3);
        suitRank.put("Spades", 4);
            
            
        if (names.get(rank) != null) {
            this.name = names.get(rank);
        }
        else {
            this.name = Integer.toString(rank);
        }
    }
    
    public boolean isLarger(Card card) {
    	if(this.getRank() > card.getRank()) {
    		return true;
    	} else if (this.getRank() < card.getRank()) {
    		return false;
    	}else {
    		if(suitRank.get(this.getSuit()) > suitRank.get(card.getSuit())) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    }
         
    
    public HashMap<String, Integer> getSuitRank() {
		return suitRank;
	}

	public void setSuitRank(HashMap<String, Integer> suitRank) {
		this.suitRank = suitRank;
	}

	public void showCard() {
        System.out.printf("%s of %s\n", this.name, this.suit);
    }


	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    
}
