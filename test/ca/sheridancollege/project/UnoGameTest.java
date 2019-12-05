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
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

/**
 *
 * @author Abdulrahman
 */
public class UnoGameTest {
    
    public UnoGameTest() {
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
    
    //this is so we can simulate input from the user!
    @Rule
    public final TextFromStandardInputStream systemInMock
        = emptyStandardInputStream();
    
    @Test
    public void testwildCardGood() {
        System.out.println("wildCardGood");
        assertEquals(true, pile.validPlay(wildcard));
    }
        
    @Test
    public void testwildCardBad() {
        System.out.println("wildCardBad");
        assertEquals(true, pile.validPlay(wildcard));
    }
       
    @Test
    public void testwildCardBoundary() {
        System.out.println("wildCardBoundary");
        assertEquals(true, pile.validPlay(wildcard));
    }
    
    @Test
    public void testUnoOrContinueGood() {
        System.out.println("testUnoOrContinueGood");
        //The user must select "UNO", since they have one card left
        UnoGame uno = new UnoGame();
        Player player = new Player();
        player.setHandSize(1);
        
        ArrayList<Card> hand = new ArrayList();
        Card card = new Card();
        card.setColour(Colour.RED);
        card.setValue(CardType.ZERO);
        
        hand.add(card);
        //the player has a hand with only one card: RED ZERO
        player.setHand(hand);
        
        //the player selects UNO
        boolean penalty = uno.UnoOrContinue(player);
        //this is so we can simulate input from the user!
        systemInMock.provideLines("1");
        
        //They should not receieve a penalty, therefore the method should return false
        assertEquals(false, penalty);
    }
        
    @Test
    public void testUnoOrContinueBad() {
        System.out.println("testUnoOrContinueBad");
        //The user should select "UNO" but instead they select "Continue"
        UnoGame uno = new UnoGame();
        Player player = new Player();
        player.setHandSize(1);
        
        ArrayList<Card> hand = new ArrayList();
        Card card = new Card();
        card.setColour(Colour.RED);
        card.setValue(CardType.ZERO);
        
        hand.add(card);
        //the player has a hand with only one card: RED ZERO
        player.setHand(hand);
        
        //the player selects Continue
        boolean penalty = uno.UnoOrContinue(player);
        //this is so we can simulate input from the user!
        systemInMock.provideLines("2");
        
        //They should receive the penalty
        assertEquals(true, penalty);
    }
       
    @Test
    public void testUnoOrContinueBoundary() {
        System.out.println("testUnoOrContinueBoundary");
        //The user will say "UNO" but they do not have 1 card left
        UnoGame uno = new UnoGame();
        Player player = new Player();
        player.setHandSize(2);
        
        ArrayList<Card> hand = new ArrayList();
        
        Card card1 = new Card();
        card1.setColour(Colour.RED);
        card1.setValue(CardType.ZERO);
        
        Card card2 = new Card();
        card2.setColour(Colour.RED);
        card2.setValue(CardType.ONE);
        
        hand.add(card1);
        hand.add(card2);
        
        //the player has a hand with two cards, RED ZERO and RED ONE
        player.setHand(hand);
        
        boolean penalty = uno.UnoOrContinue(player);
        //this is so we can simulate input from the user!
        systemInMock.provideLines("1");
        
        //Although the player should not have said UNO, they receive no penalty, and the method should return false
        assertEquals(false, penalty);
    }

}