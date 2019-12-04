/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author hussamhaidara
 * since the group the group of card, there is no need of defining cards and
 * size in this class since these attributes are already defined in the supper class.
 * redefining these attribute 
 */
public class Deck extends GroupOfCards {
		
    // constructor
    public Deck(){
        // we call the parents contructor to do exacly what the parents constructor does.	
	super(60);
        
        ArrayList<Card> deck = new ArrayList<>();
        
        //loop for the cards 0-9, and skip, reverse, and pickup2
        for (int i = 0; i < 14; i++) {
            //loop for the colours BLUE, YELLOW, RED, and GREEN
            for ( int j = 0; j < 4; j++) {
                Card card = new Card();
                card.setColour(Colour.values()[j]);
                card.setValue(CardType.values()[i]);
                deck.add(card);
            }
        }
        
        //special cards include: pickup4, and the wildcard
        for (int i = 0; i < 4; i++) {
            Card wildcard = new Card();
            wildcard.setValue(CardType.WILDCARD);
            wildcard.setColour(Colour.NOCOLOUR);
            deck.add(wildcard);
        }
        
        super.setCards(deck);
    }
    
    public void shuffle() {
        ArrayList<Card> deckCards = super.getCards();
        Collections.shuffle(deckCards);
        super.setCards(deckCards);
    }
		
    public Card nextCard() {
        ArrayList<Card> deck = super.getCards();
        int size = deck.size();
        
        //grab the last card in the cards ArrayList
        Card nextCard = deck.get(size - 1);
        
        //remove it from the ArrayList after
        deck.remove(nextCard);
        
        //set the size and card back into the abstract class
        super.setSize(size-1);
        super.setCards(deck);
        
        return nextCard;
    }
    
    public ArrayList<Card> startingCards() {
        ArrayList<Card> startingHand = new ArrayList();
        
        //a starting hand has 7 cards
        for(int i = 0; i < 7; i++) {
            startingHand.add(nextCard());
        }
        
        return startingHand;
    }

}
