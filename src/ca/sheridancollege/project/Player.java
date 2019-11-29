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
public class Player {
	//Attributes
	private String playerName;
	private int handSize;
	private ArrayList<Card> hand;
	
	// Constructor creates a new player object 
	//when creating a new player, the hand is empty and the hand size is 0
	// we therefore create an new empty hand for the player in the constructor  and assign the handsize 0.
	public Player(){
		// create empty hand for player 
		this.hand = new ArrayList();
		// the handsize is 0
		this.handSize = 0;
		
	}
	//getters method
	public String getPlayerName(){
		return playerName;
	}
	public int getHandSize(){
		return handSize;
	}
	public  ArrayList<Card> getHand(){
		return hand;
	}
	//setter methods all setter dont return anything
	// set the player name of this plaayerto the value provided in the argument
	public void setPlayerName(String playerName){
	this.playerName = playerName;	
	}
	public void setHandSize(int handSize){
	this.handSize = handSize;
	}
	//is a list that contain an object of type card
	public void setHand(ArrayList<Card> hand){
		this.hand = hand;
	}
	
}
