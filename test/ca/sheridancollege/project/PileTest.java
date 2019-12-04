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
public class PileTest {
    
    public PileTest() {
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
    
    @Test
    public void testValidPlayGood() {
        System.out.println("validPlayGood");
        //the user plays a card with the same colour or number as the top card
        Pile pile = new Pile();
        Card top = new Card();
        //This is a random top card
        top.setValue(CardType.ZERO);
        top.setColour(Colour.RED);
        pile.setTopCard(top);
        
        //see if the exact same card, with value=zero, and colour=red, will pass the validPlay method
        assertEquals(true, pile.validPlay(top));
    }
    
    @Test
    public void testValidPlayBad() {
        System.out.println("validPlayBad");
        //the user plays a card without the same colour or number as the top card
        Pile pile = new Pile();
        Card top = new Card();
        //This is a random top card
        top.setValue(CardType.ZERO);
        top.setColour(Colour.RED);
        
        pile.setTopCard(top);
        
        Card NOT_top = new Card();
        NOT_top.setValue(CardType.NINE);
        NOT_top.setColour(Colour.BLUE);
        
        //see if the exact same card, with value=zero, and colour=red, will pass the validPlay method
        assertEquals(false, pile.validPlay(NOT_top));
    }
    
    @Test
    public void testValidPlayBoundary() {
        System.out.println("validPlayBoundary");
        
        Pile pile = new Pile();
        Card top = new Card();
        //This is a random top card
        top.setValue(CardType.ZERO);
        top.setColour(Colour.RED);
        
        pile.setTopCard(top);
        
        Card wildcard = new Card();
        wildcard.setValue(CardType.WILDCARD);
        wildcard.setColour(Colour.NOCOLOUR);
        
        //the wildcard is not the same value OR colour as the top card, but since it's a special card, it should still be a valid play
        assertEquals(true, pile.validPlay(wildcard));
    }
}
