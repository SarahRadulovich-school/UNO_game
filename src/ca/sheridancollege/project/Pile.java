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
public class Pile {
	private Card topCard;
	private ArrayList<Card> cards;
	private int size;
	
	public Pile(){
		
	}
	/*getter are used to opbtain or access private attributes of a class
	since the attribute can not be accessed directly by other classes
	 stters are used to modify the private attributes of a class since they 
	can not be modified directly by other classes
	
	getttrs and etters are public so that they can be acccessed be other 
	classes */
	public Card getTopCard() {
		return topCard;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public int getSize() {
		return size;
	}

	public void setTopCard(Card topCard) {
		this.topCard = topCard;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
