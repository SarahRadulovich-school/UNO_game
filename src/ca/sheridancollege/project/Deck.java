/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author hussamhaidara
 */
public class Deck {
		private ArrayList<Card> cards;
		private int size;
// constructor
public Deck(){
	
}
		
public void firstCard(){
	}	

	public ArrayList<Card> getCards() {
		return cards;
	}

	public int getSize() {
		return size;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
