/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdulrahman
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("shuffleGood");
        Deck deck = new Deck();
        boolean shuffled = false;
        deck.shuffle();
        //we take out one card from the deck
        Card lastCard = deck.nextCard();
        //we take out 58 more cards
        for (int i =0 ; i<57;i++)
        {
            deck.nextCard();
        }
        //we take out the last card from the deck
        Card firstCard = deck.nextCard();
        
        //if both cards = the same value they were before being shuffled, then test will fail.
        if (lastCard.getValue() != CardType.WILDCARD )
            shuffled = true;
        else if (firstCard.getValue()!=CardType.ZERO)
            shuffled = true;
        
        //if either of the cards are different, that means the deck was shuffled and the test will pass
        assertEquals(true, shuffled);
    }
    
    @Test
    public void testShuffleBad() {
        System.out.println("shuffleBad");
        Deck deck = new Deck();
        
        //take out ALL cards from the deck. Deck is now empty
        for (int i =0 ; i<60;i++)
        {
            deck.nextCard();
        }
        
        // the shuffle() method should return false
        assertEquals(false, deck.shuffle());
    }
    
    @Test
    public void testShuffleBoundary() {
        System.out.println("shuffleBoundary");
        Deck deck = new Deck();
        
        //we take out 59 cards from the deck. There is one card in the deck left
        for (int i =0 ; i<58;i++)
        {
            deck.nextCard();
        }
        //shuffle the one card.
        deck.shuffle();
        //take that one card out of the deck
        Card card = deck.nextCard();
        //That card should stay the same as it original was (ZERO). 
        assertEquals(CardType.ZERO, card.getValue());
    }
    

    /**
     * Test of nextCard method, of class Deck.
     */
    @Test
    public void testNextCardGood() {
        System.out.println("nextCardGood");
        Deck deck = new Deck();
        Card card = deck.nextCard();
        ////since the deck is unshuffled, that last card should be WILDCARD
        assertEquals(CardType.WILDCARD, card.getValue());
    }
    
    @Test
    public void testNextCardBad() {
        System.out.println("nextCardBad");
        Deck deck = new Deck();
        
        //take all 60 cards out of the deck. The deck is now empty
        for (int i = 0 ; i < 60 ; i++)
        { 
            deck.nextCard();
        }
        //take the last card from the deck
        Card card = deck.nextCard();
        assertEquals(null, card.getValue());
    }
    
    @Test
    public void testNextCardBoundary() {
        System.out.println("nextCardBoundary");
        Deck deck = new Deck();
        
        //take out 59 cards from the deck. The deck now has 1 card. 
        for (int i = 0 ; i < 58 ; i++)
        { 
            deck.nextCard();
        }
        //take out the last card from the deck
        Card card = deck.nextCard();
        //since the deck is unshuffled, that last card should be ZERO
        assertEquals(CardType.ZERO, card.getValue());
    }
    
    @Test
    public void testStartingCardsGood() {
        System.out.println("testStartingCardsGood");
        //In a new deck a player can get 7 cards
        Deck deck = new Deck();
        ArrayList<Card> hand = deck.startingCards();
        
        assertEquals(7, hand.size());
    }
    
    @Test
    public void testStartingCardsBad() {
        System.out.println("testStartingCardsBad");
        //In an empty deck, the player should not be able to get their starting hand
        Deck deck = new Deck();
        //deck is empty
        for(int i = 0; i < 60; i++) {
            deck.nextCard();
        }
        
        ArrayList<Card> hand = deck.startingCards();
        
        assertEquals(0, hand.size());
    }
    
    @Test
    public void testStartingCardsBoundary() {
        System.out.println("testStartingCardsBoundary");
        //In a deck with exactly 7 cards left, a player should be able to get their starting hand
        Deck deck = new Deck();
        for(int i = 0; i < 52; i++) {
            deck.nextCard();
        }
        ArrayList<Card> hand = deck.startingCards();
        
        assertEquals(7, hand.size());
    }
    
}
