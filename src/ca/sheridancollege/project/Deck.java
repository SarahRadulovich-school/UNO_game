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
        for (int i = 0; i < 13; i++) {
            //loop for the colours BLUE, YELLOW, RED, and GREEN
            for ( int j = 0; j < 4; j++) {
                Card card = new Card();
                card.setColour(Colour.values()[j]);
                card.setValue(CardType.values()[i]);
                deck.add(card);
                System.out.println(card.getColour() + " , " + card.getValue());
            }
        }
        
        //special cards include: pickup4, and the wildcard
        for (int i = 0; i < 4; i++) {
            Card wildcard = new Card();
            wildcard.setValue(CardType.WILDCARD);
            deck.add(wildcard);
            
            Card pickup4 = new Card();
            pickup4.setValue(CardType.PICKUP4);
            deck.add(pickup4);
            System.out.println(wildcard.getValue());
            System.out.println(pickup4.getValue());
        }
    }
    
    public void shuffle() {
        ArrayList<Card> deckCards = super.getCards();
        Collections.shuffle(deckCards);
        super.setCards(deckCards);
    }
		
    public void nextCard() {
        
    }

}
