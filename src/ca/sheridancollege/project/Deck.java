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
 * since the group the group of card, there is no need of defining cards and
 * size in this class since these attrebutes are already defined in the supper class.
 * redefing these attribute 
 */
public class Deck extends GroupOfCards {
		
// constructor
public Deck(int givenSize){
// we call the parents contructor to do exacly what the parents constructor does.	
	super(givenSize);
}
		
public void firstCard(){
	}	

}
