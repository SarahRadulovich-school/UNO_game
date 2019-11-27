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
	
	// Constructor 
	public Player(){
		
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
