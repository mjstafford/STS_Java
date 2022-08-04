package com.codingdojo.hackathon;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		myDeck.ShuffleCards();
		
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println(myDeck.getSize());
			if(myDeck.getSize() < 2) {
				myDeck = new Deck();
				myDeck.ShuffleCards();
				System.out.println("New Deck");
			}
			
			System.out.println("Deal cards? (y/n)");
			String playAgain = scanner.nextLine();
			
			if(playAgain.equals("y")) {				
				Card playerCard = myDeck.dealCard();
				Card computerCard = myDeck.dealCard();
				
				System.out.print("Your Card: ");
				playerCard.showCard();
				System.out.print("Computer's Card: ");
				computerCard.showCard();
				
				if(playerCard.isLarger(computerCard)) {
					System.out.println("You Win!");
				} else {
					System.out.println("Loser");
				}

				
			} else if(playAgain.equals("n")) {
				System.out.println("until next time");
				break;
			}else {
				System.out.println("Please Select (y/n)");
			}
		}
		scanner.close();
	}

}
