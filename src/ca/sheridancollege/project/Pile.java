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

	
	
	public void setTopCard(Card topCard) {
		this.topCard = topCard;
	}

	

	
}
