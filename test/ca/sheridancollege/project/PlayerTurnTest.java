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
public class PlayerTurnTest {
    
    public PlayerTurnTest() {
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
     * Test of pickUpTwoCards method, of class PlayerTurn.
     */
    @Test
    public void testPickUpTwoCards() {
        System.out.println("pickUpTwoCards");
        PlayerTurn instance = null;
        instance.pickUpTwoCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerWon method, of class PlayerTurn.
     */
    @Test
    public void testPlayerWon() {
        System.out.println("playerWon");
        PlayerTurn instance = null;
        instance.playerWon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UnoOrContinue method, of class PlayerTurn.
     */
    @Test
    public void testUnoOrContinue() {
        System.out.println("UnoOrContinue");
        PlayerTurn instance = null;
        instance.UnoOrContinue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardDecision method, of class PlayerTurn.
     */
    @Test
    public void testCardDecision() {
        System.out.println("cardDecision");
        PlayerTurn instance = null;
        instance.cardDecision();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpOneCard method, of class PlayerTurn.
     */
    @Test
    public void testPickUpOneCard() {
        System.out.println("pickUpOneCard");
        PlayerTurn instance = null;
        instance.pickUpOneCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wildCardChoice method, of class PlayerTurn.
     */
    @Test
    public void testWildCardChoice() {
        System.out.println("wildCardChoice");
        PlayerTurn instance = null;
        instance.wildCardChoice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class PlayerTurn.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        PlayerTurn instance = null;
        Player expResult = null;
        Player result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerChoice method, of class PlayerTurn.
     */
    @Test
    public void testGetPlayerChoice() {
        System.out.println("getPlayerChoice");
        PlayerTurn instance = null;
        String expResult = "";
        String result = instance.getPlayerChoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReverseCard method, of class PlayerTurn.
     */
    @Test
    public void testGetReverseCard() {
        System.out.println("getReverseCard");
        PlayerTurn instance = null;
        boolean expResult = false;
        boolean result = instance.getReverseCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer method, of class PlayerTurn.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        Player player = null;
        PlayerTurn instance = null;
        instance.setPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerChoice method, of class PlayerTurn.
     */
    @Test
    public void testSetPlayerChoice() {
        System.out.println("setPlayerChoice");
        String playerChoice = "";
        PlayerTurn instance = null;
        instance.setPlayerChoice(playerChoice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReverseCard method, of class PlayerTurn.
     */
    @Test
    public void testSetReverseCard() {
        System.out.println("setReverseCard");
        boolean reverse = false;
        PlayerTurn instance = null;
        instance.setReverseCard(reverse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
