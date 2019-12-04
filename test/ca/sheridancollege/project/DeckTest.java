/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
        deck.shuffle();
        boolean shuffled= false;
        deck.shuffle();
        Card lastCard = deck.nextCard();
        for (int i =0 ; i<57;i++)
        { deck.nextCard();
        }
        Card firstCard = deck.nextCard();
        if (lastCard.getValue() != CardType.WILDCARD )
            shuffled = true;
        else if (firstCard.getValue()!=CardType.ZERO)
            shuffled = true;
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, shuffled);
    }
    @Test
    public void testShuffleBad() {
        System.out.println("shuffleBad");
        Deck deck = new Deck();
        deck.shuffle();
        boolean shuffled= false;
        deck.shuffle();
        Card lastCard = deck.nextCard();
        for (int i =0 ; i<57;i++)
        { deck.nextCard();
        }
        Card firstCard = deck.nextCard();
        if (lastCard.getValue() != CardType.WILDCARD )
            shuffled = true;
        else if (firstCard.getValue()!=CardType.ZERO)
            shuffled = true;
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, shuffled);
    }
    @Test
    public void testShuffleBoundary() {
        System.out.println("shuffleBoundary");
        Deck deck = new Deck();
        
        for (int i =0 ; i<58;i++)
        { deck.nextCard();
        }
        deck.shuffle();
        Card card = deck.nextCard();
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(CardType.WILDCARD, card.getValue());
    }
    @Test
    public void testNextCardBad() {
        System.out.println("nextCardBad");
        Deck deck = new Deck();
        
        // TODO review the generated test code and remove the default call to fail.
        for (int i = 0 ; i < 59 ; i++)
        { 
            deck.nextCard();
        }
        Card card = deck.nextCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("No more cards left");
    }
    @Test
    public void testNextCardBoundary() {
        System.out.println("nextCardBoundary");
        Deck deck = new Deck();
        
        for (int i = 0 ; i < 58 ; i++)
        { 
            deck.nextCard();
        }
        Card card = deck.nextCard();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(CardType.ZERO, card.getValue());
    }
    
}
